package org.javaguru.student_aleksey_taskin.lesson_3.level_2;

public class CarApp {

    public static void main(String[] args) {
        Car carBMW = new Car("BMW", "Green", "30000$");
        Car carVolkswagen = new Car("Volkswagen", "Green", "30000$");
        Car carVolvo = new Car("Volvo", "Green", "30000$");

        System.out.println(carBMW.getNameOfCar() + " " + carBMW.getColorOfCar() + " " + carBMW.getPriceOfCar());
        System.out.println(carVolkswagen.getNameOfCar() + " " + carVolkswagen.getColorOfCar() + " " + carVolkswagen.getPriceOfCar());
        System.out.println(carVolvo.getNameOfCar() + " " + carVolvo.getColorOfCar() + " " + carVolvo.getPriceOfCar());

        carBMW.setNameOfCar("BMW M-Power");

        carVolkswagen.setColorOfCar("Black");
        carVolkswagen.setPriceOfCar("50000$");

        carVolvo.setColorOfCar("Yellow");
        carVolvo.setPriceOfCar("40000$");

        System.out.println(carBMW);
        System.out.println(carVolkswagen);
        System.out.println(carVolvo);
    }
}