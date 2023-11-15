package org.java.exalbum.api.controller;

import java.util.List;

import org.java.exalbum.pojo.Photo;
import org.java.exalbum.serv.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/")
public class PhotoApiController {
	@Autowired
	private PhotoService photoService;

	// Gestisce le richieste GET per recuperare tutte le foto visibili
	@GetMapping("photos")
	public ResponseEntity<List<Photo>> apiIndex() {

		// Recupera tutte le foto visibili dal servizio PhotoService
		List<Photo> photos = photoService.findByVisibleTrue();

		// Verifica se la lista è vuota e restituisce una risposta corrispondente
		if (photos.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(photos, HttpStatus.OK);
		}
	}

	// Gestisce le richieste GET per filtrare le foto per titolo
	@GetMapping("photos/filter")
	public ResponseEntity<List<Photo>> apiFilterByTitle(@RequestParam(required = false) String title) {

		// Filtra le foto per titolo utilizzando il servizio PhotoService
		List<Photo> photos = photoService.findByTitleContainingAndVisibleTrue(title);

		// Verifica se la lista è vuota e restituisce una risposta corrispondente
		if (photos.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(photos, HttpStatus.OK);
		}
	}

}
