package demo.modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Email {

	private int id;
	private String remintente;
	private String destinatario;

	public Email(int id, String remintente, String destinatario) {
		super();
		this.id = id;
		this.remintente = remintente;
		this.destinatario = destinatario;
	}

	public Email() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRemintente() {
		return remintente;
	}

	public void setRemintente(String remintente) {
		this.remintente = remintente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	@Override
	public String toString() {
		return "Email [id=" + id + ", remintente=" + remintente + ", destinatario=" + destinatario + "]";
	}

}
