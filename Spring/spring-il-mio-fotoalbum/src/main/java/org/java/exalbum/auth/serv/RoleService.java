package org.java.exalbum.auth.serv;

import java.util.List;
import java.util.Optional;

import org.java.exalbum.auth.pojo.Role;
import org.java.exalbum.auth.repo.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

	@Autowired
	private RoleRepo roleRepo;

	public List<Role> findAll() {

		return roleRepo.findAll();
	}

	public Optional<Role> findById(int id) {

		return roleRepo.findById(id);
	}

	public Role save(Role role) {

		return roleRepo.save(role);
	}
}
