package demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.modelo.entidad.Email;
import demo.modelo.entidad.Libro;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class TareaRepasoApplication {
	
	public static ApplicationContext context;
	public static void main(String[] args) {
		context = SpringApplication.run(TareaRepasoApplication.class, args);
		Email e = context.getBean("email", Email.class);
		System.out.println(e.toString());
		Email e2 = context.getBean("primerEmail", Email.class);
		System.out.println(e2.toString());
		
		Libro l = context.getBean("libroFijo", Libro.class);
		System.out.println(l.toString());
	}

}
