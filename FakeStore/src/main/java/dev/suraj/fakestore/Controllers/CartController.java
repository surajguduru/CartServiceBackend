package dev.suraj.fakestore.Controllers;
import dev.suraj.fakestore.Models.Cart;
import dev.suraj.fakestore.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {
    private CartService cs;
    @Autowired
    public void setCartService(CartService cs){
        this.cs = cs;
    }

    @GetMapping("/carts")
    public Cart[] getAllCarts() {
        return cs.getAllCarts();
    }

    @GetMapping("/carts/{id}")
    public Cart getCartById(@PathVariable Long id) {
        return cs.getCartById(id);
    }

    @GetMapping("/carts?startdate={startdate}&enddate={enddate}")
    public Cart[] getInDateRange(@PathVariable String startdate, @PathVariable String enddate) {
        return cs.getInDateRange(startdate, enddate);
    }

    @GetMapping("/carts/user/{id}")
    public Cart[] getCartByUserId(@PathVariable Long id) {
        return cs.getCartByUserId(id);
    }

    @PostMapping("/carts")
    public void createCart(@RequestBody Cart newCart){
         cs.createCart(newCart);
    }

    @PutMapping("/carts/{id}")
    public void updateProduct(@PathVariable Long id, @RequestBody Cart product){
        cs.updateProduct(id, product);
    }

    @DeleteMapping("/carts/{id}")
    public void deleteCart(@PathVariable Long id){
        cs.deleteCart(id);
    }

}
