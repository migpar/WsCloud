package demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Pedido {

	private String id;
	private double precio;

	public Pedido() {
		super();
		this.id = "NO ID";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double d) {
		this.precio = d;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", precio=" + precio + "]";
	}

}
