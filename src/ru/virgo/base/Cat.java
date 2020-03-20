package ru.virgo.base;

public class Cat {
    String name;
    int Weight;
    int age;
    String color;
    String ownerAddress;
    int health;
    int power;

    public Cat(String name, String color) {
        setName(name);
        setColor(color);
    }

    public Cat(int health, String ownerAddress, int power) {
        setHealth(health);
        setOwnerAddress(ownerAddress);
        setPower(power);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        if(name != null && name.length() > 3) {
            this.name = name;
        }
        return name;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void printInfo() {
        System.out.println("Котяра: " + getName());
    }

    public void fightCat(Cat enemyCat) {
        health -= enemyCat.getPower();
    }
}
