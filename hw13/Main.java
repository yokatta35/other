package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Client vasya = new Client("Vasya", 40, new ArrayList<Account>());
        Client sasha = new Client("Sasha", 41, new ArrayList<Account>());

        Account accountOfVasya = new Account(111, 555.5, vasya);
        Account accountOfSasha = new Account(222, 666.6, sasha);

        vasya.getAccounts().add(accountOfVasya);
        sasha.getAccounts().add(accountOfSasha);

        List<Client> clients = new ArrayList<>();

        Bank bank = new Bank("tinkoff", clients);
        bank.getBankClients().add(vasya);
        bank.getBankClients().add(sasha);
        //bank.addAccountToClient(vasya, accountOfVasya);
        //bank.addAccountToClient(sasha, accountOfSasha);

        System.out.println(bank.getClient(accountOfSasha));//работает
        System.out.println(bank.getAccounts(vasya));

    }
}