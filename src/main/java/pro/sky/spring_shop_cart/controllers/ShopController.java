package pro.sky.spring_shop_cart.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.spring_shop_cart.services.ServiceCart;

@RestController
@RequestMapping(value = "/order")
public class ShopController {
    private final ServiceCart serviceCart;

    public ShopController(ServiceCart serviceCart) {
        this.serviceCart = serviceCart;
    }

    @GetMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addItem(@RequestParam("id") int... args) {
        serviceCart.add(args);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get")
    public ResponseEntity cart() {
        Object cart = serviceCart.getCart();
        return ResponseEntity.ok()
                .body(cart);
    }
}
