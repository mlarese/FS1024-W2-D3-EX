package it.epicode.esercizio3;

import it.epicode.ecommerce.EcommerceHelper;
import it.epicode.ecommerce.Product;

import java.util.List;

public class Main {
    public static List<Product> prodotti = EcommerceHelper.getProdotti();
    public static void main(String[] args) {
        // Lista di prodotti appartenenti alla categoria Boys
        System.out.println("Lista Prodotti categoria Boys");

        prodotti.stream()
                .filter(p -> p.getCategory().equals("Boys"))
                .map(p -> {
                    p.setPrice(p.getPrice() * 0.9);
                    return p;
                })
                .forEach(System.out::println);
    }
}
