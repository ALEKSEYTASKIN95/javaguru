package org.javaguru.student_aleksey_taskin.lesson_4.level_4;

public class StockApp {

    public static void main(String[] args) {
        Stock stock = new Stock("Apple", 287);
        System.out.println(stock.companyName);
        System.out.println(stock.currentPrice);
        System.out.println(stock.maxPrice);
        System.out.println(stock.minPrice);
        System.out.println();

        stock.updatePrice(287);
        stock.updatePrice(305);
        stock.updatePrice(300);

        System.out.println(stock.companyName);
        System.out.println(stock.minPrice);
        System.out.println(stock.maxPrice);
        System.out.println(stock.currentPrice);
    }
}
