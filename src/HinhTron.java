import java.util.Scanner;
public class HinhTron {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int i=-1;
        int radius;
        String color;
        do {
            System.out.println("1. Số liệu có sẵn");
            System.out.println("2. Số liệu tự nhập");
            System.out.println("0.Exit");
            i = sc.nextInt();
            switch (i){
                case 1:
                    circle circle1=new circle(2,"Pink");
                    System.out.println("Hình tròn màu "+circle1.getColor()+" bán kính "+ circle1.getRadius()+" có diện tích là: "+circle1.getArea());
                    break;
                case 2:
                    System.out.print("Nhập bán kính: ");
                    radius=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập màu: ");
                    color=sc.nextLine();
                    circle circle2=new circle(radius,color);
                    System.out.println("Hình tròn màu "+circle2.getColor()+" bán kính "+ circle2.getRadius()+" có diện tích là: "+circle2.getArea());
                    break;

                case 0:
                    System.exit(0);
                    break;
            }
    }while(i!=0);
}
}
class circle{
    private double radius;
    private String color;
    public circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    public circle(){

    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getArea(){
        return  Math.PI*radius*radius;
    }
}
