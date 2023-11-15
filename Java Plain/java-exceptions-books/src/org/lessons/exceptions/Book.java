package org.lessons.exceptions;

public class Book {
	
	private String title;
	private int pages;
	private String author;
	private String editor;
	
	
	public Book(String title, int pages, String author, String editor) throws Exception {
		setTitle(title);
		setPages(pages);
		setAuthor(author);
		setEditor(editor);
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) throws Exception {
		if(title.length() == 0) {
			throw new Exception("Il titolo deve contenere almeno un carattere!");
		}
		
		this.title = title;
	}


	public int getPages() {
		return pages;
	}
	public void setPages(int pages) throws Exception {
		if(pages <= 0) {
			throw new Exception("Il numero di pagine deve essere maggiore di zero!");
		}
		
		this.pages = pages;
	}


	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) throws Exception {
		if(author.length() == 0) {
			throw new Exception("L'autore deve contenere almeno un carattere!");
		}
		
		this.author = author;
	}


	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) throws Exception {
		if(editor.length() == 0) {
			throw new Exception("L'editore deve contenere almeno un carattere!");
		}
		
		this.editor = editor;
	}
	
	@Override
	public String toString() {
		
		return "[Book] " + getTitle()
				+ "\nNumero Pagine: " + getPages()
				+ "\nAutore: " + getAuthor()
				+ "\nEditore: " + getEditor();
	}
}
