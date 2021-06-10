package ourmarket;


import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    private int balance;
    private int bonusCardBalance;
    //Cashier cashier;

    Customer(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int getBonusCardBalance() {
        return bonusCardBalance;
    }

    private ArrayList<Products> basaket = new ArrayList<>();

    public ArrayList<Products> getBasaket() {
        return basaket;
    }

    public void addItem(String product) {
        if (product.equals("banana")) {
            basaket.add(Products.BANANA);
        }
        if (product.equals("apple")) {
            basaket.add(Products.APPLE);
        }
        if (product.equals("bred")) {
            basaket.add(Products.BRED);
        }
        if (product.equals("water")) {
            basaket.add(Products.WATER);
        }
        if (product.equals("cola")) {
            basaket.add(Products.COLA);
        }
        if (product.equals("paper")) {
            basaket.add(Products.PAPER);
        }
        if (product.equals("vodka")) {
            basaket.add(Products.VODKA);
        }
        if (product.equals("mango")) {
            basaket.add(Products.MANGO);
        }
        if (product.equals("notebook")) {
            basaket.add(Products.NOTEBOOK);
        }
        if (product.equals("book")) {
            basaket.add(Products.BOOK);
        }
        if (product.equals("end")) {
            System.out.println(basaket);

        }
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setBonusCardBalance(int bonusCardBalance) {
        this.bonusCardBalance = bonusCardBalance;
    }
}





