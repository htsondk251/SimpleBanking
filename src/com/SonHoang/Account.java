package com.SonHoang;

public class Account {
    private long id;
    private double balance = 0.0;
    private double interestRate = 0.01;
    private Customer customer;

    private double fee; //simple: only 1 fee level for all transaction

    //in-future characteristics
//    private List<Card> cards;
//    private List<Saving> savings;


    public Account(long id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

//    public Account(long id, double balance, double interestRate, Customer customer) {
//        this.id = id;
//        this.balance = balance;
//        this.interestRate = interestRate;
//        this.customer = customer;
//    }

    //getter
    public long getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public Customer getCustomer() {
        return customer;
    }

    //setter
    public void setId(long id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setCustomer(String customer) {
        customer = customer;
    }

    private void changeBalance(double amount) {
        setBalance(balance + amount);
    }

    public void subValue(double amount) throws IllegalArgumentException {
//        boolean isCompleted = false;
        //check if balance enough to deduct
        if (balance < (amount + fee)) {
            throw new IllegalArgumentException("not enough money");
        } else {
            //changeBalance
            changeBalance(-amount - fee);
//            isCompleted = true;
        }
//        return isCompleted;
    }

    public void addValue(double amount) {
        changeBalance(balance + amount);
    }

    private double calculateMonthlyInterest() {
        return balance * interestRate / 12;
    }

    //TODO: add monthlyInterest at the last day of every month
    public void addMonthlyInterest() {
        setBalance(balance + calculateMonthlyInterest());
    }

    //TODO: data structure to link account and customer
    public void showDetails() {
        System.out.println("id: " + id
                + ", owner: " + customer.getLastName() + " " + customer.getFirstName()
                + ", balance: " + balance);
    }

    //TODO: delete() should be in Account or Bank
    public void delete() {}


}
