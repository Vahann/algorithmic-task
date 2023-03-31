package com.company.streamAPI;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;

public class CustomCollectorDemo {
    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(
                new Product(23, "Potatoes"),
                new Product(14, "Orange"),
                new Product(13, "Lemon"),
                new Product(23, "Bread"),
                new Product(13, "Sugar"));

        Collector<Product, ?, LinkedList<Product>> toLinkedList =
                Collector.of(LinkedList::new, LinkedList::add, (first, second) -> {
                    first.addAll(second);
                    return first;
                });

        LinkedList<Product> linkedListOfProducts = productList.stream().collect(toLinkedList);
    }
}
