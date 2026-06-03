package org.javaguru.student_aleksey_taskin.lesson_4.level_1;

class Calendar {

    public void checkInput(int number) {
        if (number == 1) {
            System.out.println("Sunday");
        } else if (number == 2) {
            System.out.println("Monday");
        } else if (number == 3) {
            System.out.println("Thursday");
        } else if (number == 4) {
            System.out.println("Whensday");
        } else if (number == 5) {
            System.out.println("Firthday");
        } else if (number == 6) {
            System.out.println("Friday");
        } else if (number == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Неправильно введен номер");
        }
    }
}
