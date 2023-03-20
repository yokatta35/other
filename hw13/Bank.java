package com.company;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    String name;
    List<Client> bankClients;

    public Bank(String name, List<Client> bankClients) {
        this.name = name;
        this.bankClients = bankClients;
    }

   // public void addAccountToClient(Client client, Account account) {
     //   if (account.getOwner().equals(client)) {
       //     for (Client current : bankClients) {
         //       if (current.getName().equals(client.getName())) {
           //         current.getAccounts().add(account);
             //   }
            //}
        //} else {
          //  System.out.println("Вы не владелец этого аккаунта");
        //}
    //}

    public List<Account> getAccounts(Client client) {
        for (Client current : bankClients) {
            if (current.equals(client)) {
                return current.getAccounts();
            }
        }
        System.out.println("У такого клиента нет аккаунтов");
        return null;
    }

    public String getClient(Account account) {
        for (Client current : bankClients) {
            for (Account currentAccount : current.getAccounts()) {
                if (currentAccount.equals(account)) {
                    return current.getName();
                }
            }
        }
        System.out.println("Такой аккаунт в банке не числится");
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Client> getBankClients() {
        return bankClients;
    }

    public void setBankClients(List<Client> bankClients) {
        this.bankClients = bankClients;
    }
}
