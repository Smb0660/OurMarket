package ourmarket;

public enum Products {
    APPLE(500),
    BANANA(1200),
    BRED(200),
    WATER(150),
    COLA(250),
    VODKA(3500),
    MANGO(1600),
    PAPER(50),
    BOOK(2500),
    NOTEBOOK(300),
    ;
    private int price;

    Products(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
