package chp08;

class Drink {
    private String name;
    private int price;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int p) {
        price = p;
    }

    public int getPrice() {
        return price;
    }

    Drink() {
        name = "이름없음";
        price = 0;
    }

    Drink(String n, int p) {
        name = n;
        price = p;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", Price=" + price +
                "}";
    }
}