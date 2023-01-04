package Task4;

public class TV {
    private String name;
    private int year;
    private int price;
    private int diagonal;
    private String manufacturer;

    public TV(String name, int year, int price, int diagonal, String manufacturer) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String toString() {
        return "Телевизор " +
                "\t\"" + name + "\", "
                + year + " года, " +
                "цена " + price + " руб., " +
                "диагональ " + diagonal + " см, " +
                "фирма " + "\"" + manufacturer + "\"";
    }
}