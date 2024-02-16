import java.util.*;

abstract class Vehicle {
    boolean hasHelmet;
    int yom;

    abstract void getData();
    abstract void putData();

    Vehicle(boolean h, int n) {
        hasHelmet = h;
        yom = n;
    }
}

class TwoWheeler extends Vehicle {
    private String Brand;
    protected int Cost;
    String EngineType;
    public String Color;

    TwoWheeler(int n) {
        super(true, n);
    }

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Brand name, Cost, EngineType, and Colour");
        Brand = sc.next();
        Cost = sc.nextInt();
        EngineType = sc.next();
        Color = sc.next();
    }

    void putData() {
        System.out.println("Brand: " + Brand + "\nCost: " + Cost + "\nEngineType: "
                + EngineType + "\nColor: " + Color + " \nYear of Manufacture: "
                + yom + "\nHas helmet: " + hasHelmet);
    }
}

final class FourWheeler extends Vehicle {
    FourWheeler(int n) {
        super(false, n);
    }

    void getData() {
    }

    void putData() {
        System.out.println("Year of Manufacture: " + yom + "\nHas helmet: " + hasHelmet);
    }
}

class MyTwoWheeler extends TwoWheeler {
    String name;

    MyTwoWheeler(String name, int n) {
        super(n);
        this.name = name;
    }

    void display() {
        super.getData();
        putData();
        System.out.println("Name: " + name);
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        TwoWheeler t1 = new TwoWheeler(1995);
        FourWheeler f1 = new FourWheeler(2006);
        MyTwoWheeler m1 = new MyTwoWheeler("activa",1111);
        t1.getData();
        t1.putData();
        System.out.println("gayaggyagay");
        m1.putData();
        System.out.println("gayaggyagay");
        f1.putData();
    }
}
