package pro.sky.spring_shop_cart.services;

public interface ServiceCart {

    void add(int... items);

    String getCart();
}
