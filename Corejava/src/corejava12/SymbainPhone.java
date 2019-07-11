package corejava12;

public class SymbainPhone {

    private float width;
    private float height;
    private String brand;
    private String os;
    private float price;

    public SymbainPhone() {

    }


    @Override
    public String toString() {
        return "SymbainPhone{" +
                "width=" + width +
                ", height=" + height +
                ", brand='" + brand + '\'' +
                ", os='" + os + '\'' +
                ", price=" + price +
                '}';
    }

    public SymbainPhone(float width, float height, String brand, String os, float price) {
        this.width = width;
        this.height = height;
        this.brand = brand;
        this.os = os;
        this.price = price;
    }
    }

