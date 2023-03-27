import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = -1, b, c;
        do {
            System.out.println("Phương trình bậc 2: ax2+bx+c=0");
            System.out.print("Nhập a: ");
            a = sc.nextDouble();
            System.out.print("Nhập b: ");
            b = sc.nextDouble();
            System.out.print("Nhập c: ");
            c = sc.nextDouble();
        } while (a == 0);
        quadraticEquation duLieu = new quadraticEquation(a, b, c);
        System.out.println("delta của phương trình là: " + duLieu.getDiscriminant());
        if (duLieu.getDiscriminant() == 0) {
            System.out.println("Nghiệm của phương trình là:" + duLieu.getRoot1());
        } else {
            System.out.println("Nghiệm của phương trình là: ");
            System.out.println("Nghiệm 1: " + duLieu.getRoot1());
            System.out.println("Nghiệm 2: " + duLieu.getRoot2());
        }
    }
}

class quadraticEquation {
    private double a, b, c, delta, test1, test2;

    public quadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public quadraticEquation() {

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return delta = b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (delta < 0) {
            return 0;
        } else {
            return (-b + Math.sqrt(delta)) / (2 * a);
        }
    }

    public double getRoot2() {
        if (delta < 0) {
            return 0;
        } else {
            return (-b - Math.sqrt(delta)) / (2 * a);
        }
    }
}

