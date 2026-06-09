package org.javaguru.student_aleksey_taskin.lesson_4.level_4;

class Stock {

    String companyName;
    double currentPrice;
    double minPrice;
    double maxPrice;

    public Stock(String companyName, double currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;
    }

    public void updatePrice(double newPrice) {
        this.currentPrice = newPrice;
        if (this.maxPrice <= newPrice) {
            this.maxPrice = newPrice;
        } else if (this.minPrice >= newPrice) {
            this.minPrice = newPrice;
        }
    }

//    public String getCompanyName() {
//        return companyName;
//    }
//
//    public double getCurrentPrice() {
//        return currentPrice;
//    }

    public double getMinPrice() {
        return minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }


}
