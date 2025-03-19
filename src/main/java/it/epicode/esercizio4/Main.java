package it.epicode.esercizio4;

import it.epicode.ecommerce.EcommerceHelper;
import it.epicode.ecommerce.Order;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static List<Order> ordini = EcommerceHelper.getOrdini();

    public static void main(String[] args) {
        // lita prodotti ordinati da Customer di tier 2 tra 2021-02-01 e il 2012-04-01
        System.out.println("Lista prodotti ordinati da Customer di tier 2 tra 2021-02-01 e il 2021-04-01");
        LocalDate d1 = LocalDate.parse("2021-02-01");
        LocalDate d2 = LocalDate.parse("2021-04-01");

        ordini.stream()
                .filter(order ->
                        order.getCustomer().getTier() == 2 &&
                        order.getOrderDate().isAfter(d1) &&
                        order.getOrderDate().isBefore(d2)
                        )
                .forEach(System.out::println);



    }
}
