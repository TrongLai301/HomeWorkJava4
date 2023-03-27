import java.util.*;

public class WorkClassRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = -1, j;
        do {
            System.out.println("1. Số liệu có sẵn");
            System.out.println("2. Số liệu tự nhập");
            System.out.println("0.Exit");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    hinhChuNhat hinhChuNhatNew = new hinhChuNhat(2, 3);
                    System.out.println("Diện tích hình chữ nhật là: " + hinhChuNhatNew.tinhDienTich());
                    System.out.println("Chu vi hình chữ nhật là: " + hinhChuNhatNew.tinhChuVi());
                    System.out.println("Hình vẽ(1cm=1*):");
                    for (i = 0; i < hinhChuNhatNew.height; i++) {
                        System.out.println(" ");
                        for (j = 0; j < hinhChuNhatNew.width; j++) {
                            System.out.print("* ");
                        }
                    }
                    System.out.println(" ");
                    break;

                case 2:
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
                    System.out.println("Hình vẽ(1cm=1*):");
                    for (i = 0; i < hinhChuNhatNew1.height; i++) {
                        System.out.println(" ");
                        for (j = 0; j < hinhChuNhatNew1.width; j++) {
                            System.out.print("* ");
                        }
                    }
                    System.out.println(" ");
                    break;

                case 0:
                    System.exit(0);
                    break;
            }
        } while (i != 0);
    }
}

