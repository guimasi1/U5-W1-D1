package gmasi.U5W1D1;

import gmasi.U5W1D1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W1D1Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D1Application.class);
		Menu menu = (Menu) ctx.getBean("getMenu");
		// System.out.println(menu);
		menu.showMenu();

	}

}
