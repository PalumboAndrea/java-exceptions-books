package org.java.exceptions.books;

public class Libro {
	
	private String title;
	private int pageNumber;
	private String author;
	private String editor;
	
	public Libro (String title, int pageNumber,
			String author, String editor) throws Exception {
		setTitle(title);
		setPageNumber(pageNumber);
		setAuthor(author);
		setEditor(editor);
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) throws Exception {

		if (title.length() == 0) {
			throw new Exception("Il titolo non puo' essere vuoto");
		}
		
		this.title = title;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) throws Exception {
		
		if (pageNumber <= 0) {
			throw new Exception("Le pagine devono essere un numero positivo");
		}
		
		this.pageNumber = pageNumber;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	
	protected String getBookString() {
		
		return "Titolo: " + getTitle()
			+ "\nAutore: " + getAuthor()
			+ "\nEditore: " + getEditor();
	}
	
	@Override
	public String toString() {
		
		return getBookString();
	}
	
	
	
	
}
