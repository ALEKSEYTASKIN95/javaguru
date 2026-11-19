package org.javaguru.student_aleksey_taskin.lesson_5.level_7.Task_1;

public class TemperatureConverter {

    public double toCelsiusConvert(int temperature) {
        return (double) ((temperature - 32) * 5) / 9;
    }

    public double toPharyngitisConvert(int temperature) {
        return (temperature * (double) ((9 / 5)) + 32);
    }


}
