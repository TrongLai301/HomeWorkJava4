import java.util.*;

public class ClassDate {
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
                    myDate date = new myDate(02, 03, 2004);
                    System.out.println("Date mặc định là: Ngày " + date.getDay() + " Tháng " + date.getMonth() + " Năm " + date.getYear());
                    break;
                }
                case 2: {
                    boolean check = false;
                    int day, month, year;
                    do {
                        System.out.print("Enter day: ");
                        day = sc.nextInt();
                        System.out.print("Enter month: ");
                        month = sc.nextInt();
                        System.out.print("Enter year: ");
                        year = sc.nextInt();
                        if (day < 1 || day > 31)
                            if (month >= 1 && month <= 12 && year >= 800 && year <= 2022)
                                System.out.println("Nhập sai ngày");
                        if (month < 1 || month > 12)
                            if (day >= 1 && day <= 31 && year >= 800 && year <= 2022)
                                System.out.println("Nhập sai tháng");
                            else {
                                if (day < 1 || day > 31 && month < 1 || month > 12 && year >= 800 && year <= 2022) {
                                    System.out.println("Nhập sai ngày, tháng");
                                }
                            }
                        if (year < 800 || year > 2022) {
                            if (month >= 1 && month <= 12 && day >= 1 && day <= 31)
                                System.out.println("Nhập sai năm");
                            else {
                                if (year < 800 || year > 2022 && month < 1 || month > 12 && day >= 1 && day <= 31) {
                                    System.out.println("Nhập sai tháng, năm");
                                }
                            }
                        }
                        if (year < 800 || year > 2022) {
                            if (day < 1 || day > 31 && month >= 1 && month <= 12)
                                System.out.println("Nhập sai ngày, năm");
                        }
                        if (day < 1 || day > 31) {
                            if (month < 1 || month > 12) {
                                if (year < 800 || year > 2022) {
                                    System.out.println("Nhập sai ngày, tháng, năm");
                                }
                            }
                        }
                        if (day >= 1 && day <= 31 && year >= 800 && year <= 2022 && month >= 1 && month <= 12) {
                            check = true;
                        }

                    } while (check != true);
                    myDate dateEnter = new myDate(day, month, year);
                    System.out.println("Date thiết lập mới là: Ngày " + dateEnter.getDay() + " Tháng " + dateEnter.getMonth() + " Năm " + dateEnter.getYear());
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

class myDate {
    private int day, month, year;

    public myDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public myDate() {

    }
}