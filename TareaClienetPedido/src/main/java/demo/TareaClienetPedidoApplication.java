package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TareaClienetPedidoApplication {
	public static ApplicationContext context = null;
	public static void main(String[] args) {
		context = SpringApplication.run(TareaClienetPedidoApplication.class, args);
		
		Cliente c1 = context.getBean("cliente", Cliente.class);
		System.out.println(c1);
		
		
		Cliente c2 = context.getBean("cliente", Cliente.class);
		c2.getPedido().setPrecio(25.3);
		c2.getPedido().setId("123B");
		c2.setNombre("Alberlon");
		c2.setApellido("WOWLord");
		System.out.println(c2);
	}

}
