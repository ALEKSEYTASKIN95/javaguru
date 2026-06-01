package org.javaguru.student_aleksey_taskin.lesson_3.level_7;

class BankAccount {

    private String owner;
    private int money;

    BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }
}
