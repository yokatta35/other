package com.company;
import java.util.List;
import java.util.Objects;

public class Client {

    private String name;
    private int age;
    List<Account> accounts;

    public Client(String name, int age, List<Account> accounts) {
        this.name = name;
        this.age = age;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && Objects.equals(name, client.name) && Objects.equals(accounts, client.accounts);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age, accounts);
    }

}
