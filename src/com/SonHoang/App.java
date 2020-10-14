package com.SonHoang;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;

public class App {
    public static void main(String[] args) {
//        System.out.println("End course project");

        Bank b1 = new Bank("ABC", "HN");
        List<Account> accounts = new ArrayList<>();

        Customer c1 = new Customer("172645991", "Son", "Hoang Thanh", "16/06/1988", "HBT, HN", "htsondk251@gmail.com", "0984964197");
        Customer c2 = new Customer("172645910", "Dzung", "Hoang Thi", "16/06/1986", "HBT, HN", "dzunghoang.n21@gmail.com", "0919581286");
        Customer c3 = new Customer("172645912", "Hanh", "Tran Minh", "16/06/1997", "HBT, HN", "bighero6@gmail.com", "0344592834");
        Customer c4 = new Customer("172645913", "Minh", "Tran Nguyet", "16/06/1993", "HBT, HN", "nguyetminhbs93@gmail.com", "0335198726");

        Account a1 = new Account(3805449019l, c1);
        accounts.add(a1);
        Account a2 = new Account(3805449020l, c2);
        accounts.add(a2);
        Account a3 = new Account(3805449021l, c3);
        accounts.add(a3);
        Account a4 = new Account(3805449022l, c4);
        accounts.add(a4);

        b1.setAccounts(accounts);

//        b1.getAccounts().get(0).showDetails();
//        b1.getAccounts().get(1).showDetails();
//        b1.getAccounts().get(2).showDetails();
//        b1.getAccounts().get(3).showDetails();

        b1.getAccounts().get(0).addValue(50.0);
        System.out.println(b1.getAccounts().get(0).getBalance());
    }
}