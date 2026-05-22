package org.javaguru.student_aleksey_taskin.lesson_3.level_1;

public class RobotApp {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Stepan");
        Robot robot2 = new Robot("Kakaha");

        System.out.println("Robot1 name = " + robot1.getRobotName());
        System.out.println("Robot2 name = " + robot2.getRobotName());

        robot1.setRobotName("Sveta");
        robot2.setRobotName("Nastya");

        System.out.println(robot1.getRobotName());
        System.out.println(robot2.getRobotName());
    }
}
