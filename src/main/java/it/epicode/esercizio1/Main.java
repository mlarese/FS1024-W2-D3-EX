package it.epicode.esercizio1;

import it.epicode.ecommerce.EcommerceHelper;
import it.epicode.ecommerce.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> prodotti = EcommerceHelper.getProdotti();
        // lista prodotti categoria Books
        System.out.println("Prodotti categoria Books");
        prodotti.stream()
                .filter(p -> p.getCategory().equals("Books"))
                .forEach(System.out::println);
    }

}
