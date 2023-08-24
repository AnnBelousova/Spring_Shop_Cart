package pro.sky.spring_shop_cart.services.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import pro.sky.spring_shop_cart.services.ServiceCart;

import java.util.*;

@Service
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ServiceCartImpl implements ServiceCart {
    List<Integer> cart = new ArrayList<>();

    @Override
    public void add(int... items) {
        for (int e : items) {
            cart.add(e);
        }
    }

    @Override
    public String getCart() {
        return cart.toString();
    }
}
