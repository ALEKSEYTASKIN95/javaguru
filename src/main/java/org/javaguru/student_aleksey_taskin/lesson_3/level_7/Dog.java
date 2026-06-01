package org.javaguru.student_aleksey_taskin.lesson_3.level_7;

class Dog {

    private String nameOfDog;
    private int age;

    public Dog(String nameOfDog, int age) {
        this.nameOfDog = nameOfDog;
        this.age = age;
    }

    public void sayBark(){
        System.out.println("My nickname is " + nameOfDog);
    }

    public void happyBirthday(){
        this.age += 1;
    }

    public void sayDogAge(){
        System.out.println(age);
    }

    public String getNameOfDog() {
        return nameOfDog;
    }

    public int getAge() {
        return age;
    }
}
