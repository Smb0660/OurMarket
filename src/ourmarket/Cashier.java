package ourmarket;

public class Cashier {

    private int sum = 0;

    public int getSum(Customer customer) {
//        if (customer.getBasaket().contains(Products.APPLE)) {
//            sum += Products.APPLE.getPrice();
//        }
//        if (customer.getBasaket().contains(Products.MANGO)) {
//            sum += Products.MANGO.getPrice();
//        }
//        if (customer.getBasaket().contains(Products.BANANA)) {
//            sum += Products.BANANA.getPrice();
//        }
//        if (customer.getBasaket().contains(Products.BOOK)) {
//            sum += Products.BOOK.getPrice();
//        }
//        if (customer.getBasaket().contains(Products.BRED)) {
//            sum += Products.BRED.getPrice();
//        }
//        if (customer.getBasaket().contains(Products.NOTEBOOK)) {
//            sum += Products.NOTEBOOK.getPrice();
//        }
//        if (customer.getBasaket().contains(Products.WATER)) {
//            sum += Products.WATER.getPrice();
//        }
//        if (customer.getBasaket().contains(Products.COLA)) {
//            sum += Products.COLA.getPrice();
//        }
//        if (customer.getBasaket().contains(Products.PAPER)) {
//            sum += Products.PAPER.getPrice();
//        }
//        if (customer.getBasaket().contains(Products.VODKA)) {
//            sum += Products.VODKA.getPrice();
//        }
        for (Products products : customer.getBasaket()
             ) {
            sum += products.getPrice();
        }



        return sum;

    }

    public int askSum() {
        //    System.out.println(sum);
        return sum;
    }

    public int getPercent(Customer customer) {
        customer.setBonusCardBalance(customer.getBonusCardBalance() + (sum * 15 / 100));
        return customer.getBonusCardBalance();
    }

    public void giveCoupon(Customer customer) {
        System.out.println("Our Market");
        if (customer.getBasaket().contains(Products.APPLE)) {
            System.out.println("--Apple " + Products.APPLE.getPrice() + " AMD--");
        }
        if (customer.getBasaket().contains(Products.MANGO)) {
            System.out.println("--Mango " + Products.MANGO.getPrice() + " AMD--");
        }
        if (customer.getBasaket().contains(Products.BANANA)) {
            System.out.println("--Banana " + Products.BANANA.getPrice() + " AMD--");
        }
        if (customer.getBasaket().contains(Products.BOOK)) {
            System.out.println("--Book " + Products.BOOK.getPrice() + " AMD--");
        }
        if (customer.getBasaket().contains(Products.BRED)) {
            System.out.println("--Bred " + Products.BRED.getPrice() + " AMD--");
        }
        if (customer.getBasaket().contains(Products.NOTEBOOK)) {
            System.out.println("--Notebook " + Products.NOTEBOOK.getPrice() + " AMD--");
        }
        if (customer.getBasaket().contains(Products.WATER)) {
            System.out.println("--Water " + Products.WATER.getPrice() + " AMD--");
        }
        if (customer.getBasaket().contains(Products.COLA)) {
            System.out.println("--Coca-Cola " + Products.COLA.getPrice() + " AMD--");
        }
        if (customer.getBasaket().contains(Products.PAPER)) {
            System.out.println("--Paper " + Products.PAPER.getPrice() + " AMD--");
        }
        if (customer.getBasaket().contains(Products.VODKA)) {
            System.out.println("--Vodka " + Products.VODKA.getPrice() + " AMD---");
        }
        System.out.println("--Total cost  " + askSum() + "AMD" + "--");
        System.out.println("--The amount you paid  " + customer.getBalance() + "--");
        System.out.println("--Your change  " + (customer.getBalance() - askSum()) + "--");
        System.out.println("--In your Bonus Card you have  " + getPercent(customer) + "--");
        System.out.println("----THANK YOU----");
    }


    public void checkDeal(Customer customer) {
        getSum(customer);
        if (customer.getBalance() < sum) {
            try {
                throw new Exception("you dont have money");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {

            giveCoupon(customer);

        }


    }
}

