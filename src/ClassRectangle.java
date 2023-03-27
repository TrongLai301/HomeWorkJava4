import java.util.*;

public class ClassRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = -1;
        do {
            System.out.println("1. Số liệu có sẵn");
            System.out.println("2. Số liệu tự nhập");
            System.out.println("0.Exit");
            i = sc.nextInt();
            switch (i) {
                case 1: {
                    hinhChuNhat hinhChuNhatNew = new hinhChuNhat(2, 3);
                    System.out.println("Diện tích hình chữ nhật là: " + hinhChuNhatNew.tinhDienTich());
                    System.out.println("Chu vi hình chữ nhật là: " + hinhChuNhatNew.tinhChuVi());
                    break;
                }
                case 2: {
                    double height, width;
                    do {
                        System.out.print("Nhập chiều cao: ");
                        height = sc.nextDouble();
                        System.out.print("Nhập chiều rộng: ");
                        width = sc.nextDouble();
                    }
                    while (height > width);
                    hinhChuNhat hinhChuNhatNew1 = new hinhChuNhat(height, width);
                    System.out.println("Diện tích hình chữ nhật là: " + hinhChuNhatNew1.tinhDienTich());
                    System.out.println("Chu vi hình chữ nhật là: " + hinhChuNhatNew1.tinhChuVi());
                    break;
                }
                case 0: {
                    System.exit(0);
                    break;
                }
            }

        } while (i != 0);
    }
}

class hinhChuNhat {
    public double height;
    public double width;

    public double tinhChuVi() {
        return (height + width) * 2;
    }

    public double tinhDienTich() {
        return height * width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public hinhChuNhat(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public hinhChuNhat() {
    }
}