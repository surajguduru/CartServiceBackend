package dev.suraj.fakestore.Service;

import dev.suraj.fakestore.Models.Cart;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CartService {
    private final String apiUrl = "https://fakestoreapi.com/carts";
    public Cart[] getAllCarts() {
        RestTemplate restTemplate = new RestTemplate();
        Cart[] products = restTemplate.getForObject(apiUrl, Cart[].class);
        return products;
    }

    public Cart getCartById(Long id){
        RestTemplate restTemplate = new RestTemplate();
        Cart result = restTemplate.getForObject(apiUrl + "/" + id, Cart.class);
        return result;
    }

    public Cart[] getInDateRange(String startdate, String enddate){
        RestTemplate restTemplate = new RestTemplate();
        Cart[] result = restTemplate.getForObject(apiUrl + "?startdate=" + startdate + "&enddate=" + enddate, Cart[].class);
        return result;
    }

    public Cart[] getCartByUserId(Long id){
        RestTemplate restTemplate = new RestTemplate();
        Cart[] result = restTemplate.getForObject(apiUrl + "/user/" + id, Cart[].class);
        return result;
    }

    public void createCart(Cart newCart){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(apiUrl, newCart, Cart.class);
        System.out.println("Product created successfully");
    }

    public void updateProduct(Long id, Cart product){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(apiUrl + "/carts/" + id, product);
        System.out.println("Product updated successfully");
    }

    public void deleteCart(Long id){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(apiUrl + "/carts/" + id);
        System.out.println("Product deleted successfully");
    }

}
