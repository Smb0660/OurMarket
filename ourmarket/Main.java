package ourmarket;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer(8000); // your balance
        String product = null;
        Cashier cashier = new Cashier();
        System.out.println("Welcome to our store, just write their names to put the goods in the basket");
        System.out.println("Type -end- if you are finished your shopping");
        do {
            product = scanner.nextLine();
            customer.addItem(product);
        } while (!product.equals("end"));
        cashier.checkDeal(customer);
    }
}
