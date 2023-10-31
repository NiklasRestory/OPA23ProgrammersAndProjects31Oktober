package org.example;

public class Programmer extends Item {
    private int age;
    private int hackerRanking;

    private static int nextProgrammerId = 1;

    public Programmer(String name, int age, int hackerRanking) {
        super(nextProgrammerId, name);
        nextProgrammerId++;
        this.age = age;
        this.hackerRanking = hackerRanking;
    }

    public void printInfo() {
        System.out.println("Id: " + id + ", Name: " + name + ", Age:" + age + ", Hacker Ranking: " + hackerRanking);
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
