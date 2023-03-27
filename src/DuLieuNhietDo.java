import java.util.Scanner;
public class DuLieuNhietDo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=-1;
        double c;
        do {
            System.out.println("1. Số liệu có sẵn");
            System.out.println("2. Số liệu tự nhập");
            System.out.println("0.Exit");
            i = sc.nextInt();
            switch (i){
                case 1:
                    temperature temperatureNew= new temperature(25);
                    System.out.println("Giá trị của °F là: "+temperatureNew.ctoF()+"°F");
                    System.out.println("Giá trị của kelvin là: "+temperatureNew.ctokelvin()+"K");
                    break;
                case 2:
                    do{
                        System.out.print("Nhập °C(Giá trị nhỏ nhất là -273°C): ");
                        c= sc.nextDouble();
                    }while(c<-273);
                    temperature temperatureNew1= new temperature(c);
                    System.out.println("Giá trị của °F là: "+temperatureNew1.ctoF()+"°F");
                    System.out.println("Giá trị của kelvin là: "+temperatureNew1.ctokelvin()+"K");
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }while(i!=0);
    }
}
class temperature{
    private double c,f,kelvin=273.15;
    public temperature(double c ){
        this.c=c;
    }
    public temperature(){
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c= c;
    }
    public double ctoF(){
        return 1.8*c+32;
    }
    public double ctokelvin(){
       return c+kelvin;
    }
}