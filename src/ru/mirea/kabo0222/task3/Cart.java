package ru.mirea.kabo0222.task3;
import java.util.*;
public class Cart {
    private List<String> cartItems;

    public Cart() {
        this.cartItems = new ArrayList<>();
    }

    public void addToCart(String product) {
        cartItems.add(product);
    }

    public void checkout() {
        System.out.println("Ваша корзина содержит следующие товары:");
        for (String item : cartItems) {
            System.out.println(item);
        }

        System.out.println("Процесс покупки товаров...");

        // Ваша логика для процесса покупки товаров
    }
}