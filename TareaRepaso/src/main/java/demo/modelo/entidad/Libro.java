package demo.modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototyped")
public class Libro {

	private String isbn;
	private String editorial;
	@Autowired
	private Autor autor;

	public Libro(String isbn, String editorial, Autor autor) {
		super();
		this.isbn = isbn;
		this.editorial = editorial;
		this.autor = autor;
	}

	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", editorial=" + editorial + ", autor=" + autor + "]";
	}

}
