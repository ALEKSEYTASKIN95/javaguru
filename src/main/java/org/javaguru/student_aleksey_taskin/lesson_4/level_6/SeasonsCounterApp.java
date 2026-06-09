package org.javaguru.student_aleksey_taskin.lesson_4.level_6;

import java.util.Scanner;

class SeasonsCounterApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SeasonsCounter seasonsCounter = new SeasonsCounter();

        while (true) {
            System.out.println("Введите номер месяца");
            int month = scanner.nextInt();
            seasonsCounter.countSeason(month);
        }
    }
}
