package it.epicode.esercizio2;

import it.epicode.ecommerce.EcommerceHelper;
import it.epicode.ecommerce.Order;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> ordini = EcommerceHelper.getOrdini();
        // lista ordini con prodotti appartenenti alla categoria Baby
        System.out.println("Ordini con prodotti categoria Baby");
        ordini.stream()
                // per ciascun ordine prendo la lista dei prodotti
                // e ne faccio lo stream
                // se trovo anche un solo prodotto che appartiene alla categoria Baby
                // lo metto nel risultato
                .filter(o -> o.getProducts().stream()
                        .anyMatch(p -> p.getCategory().equals("Baby")))
                .forEach(System.out::println);

    }
}
