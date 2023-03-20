package com.company;
public class Account {

    private int number;
    private double money;
    private Client owner;

    public Account(int number, double money, Client owner) {
        this.number = number;
        this.money = money;
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", money=" + money +
                ", owner=" + owner +
                '}';
    }

}
