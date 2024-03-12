package dev.suraj.fakestore;
import dev.suraj.fakestore.Controllers.CartController;
import dev.suraj.fakestore.Models.Cart;
import dev.suraj.fakestore.Service.CartService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FakeStoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(FakeStoreApplication.class, args);
	}
}
