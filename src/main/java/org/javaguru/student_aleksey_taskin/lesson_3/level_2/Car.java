
package org.javaguru.student_aleksey_taskin.lesson_3.level_2;

public class Car {
    private String nameOfCar;
    private String colorOfCar;
    private String priceOfCar;

    public Car(String nameOfCar, String colorOfCar, String priceOfCar) {
        this.nameOfCar = nameOfCar;
        this.colorOfCar = colorOfCar;
        this.priceOfCar = priceOfCar;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public String getColorOfCar() {
        return colorOfCar;
    }

    public String getPriceOfCar() {
        return priceOfCar;
    }

    public void setNameOfCar(String nameOfCar) {
        this.nameOfCar = nameOfCar;
    }

    public void setColorOfCar(String colorOfCar) {
        this.colorOfCar = colorOfCar;
    }

    public void setPriceOfCar(String priceOfCar) {
        this.priceOfCar = priceOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameOfCar='" + nameOfCar + '\'' +
                ", colorOfCar='" + colorOfCar + '\'' +
                ", priceOfCar='" + priceOfCar + '\'' +
                '}';
    }
}
