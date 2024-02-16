import java.util.*;

interface area {
    double pi = 3.14;
    double calc(double x, double y);
}

class rect implements area {
    public double calc(double x, double y) {
        return (x * y);
    }
}

class cir implements area {
    public double calc(double x, double y) {
        return (pi * x * x);
    }
}

class area_interface {
    public static void main(String args[]) {
        rect r = new rect();
        cir c = new cir();
        area a;
        a = r;
        System.out.println("\nArea of Rectangle is: " + r.calc(10, 10));
        a = c;
        System.out.println("\nArea of Circle is: " + c.calc(10, 10));
    }
}
