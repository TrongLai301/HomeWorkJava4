public class Test {
    public static void main(String[] args) {
        //Khởi tạo phương thức
        retangle retangle1=new retangle(3,2);
        //truy cập thuộc tính
        retangle1.height=4;
        //truy cập phương thức
        retangle1.displayinfo();
    }
}
class retangle{
    //Khai báo thuộc tính
    public int height;
    public int width;
    //Khai báo phương thức
    public retangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void displayinfo(){
        System.out.println("Chiều cao: "+this.height+"cm");
        System.out.println("Chiều rộng: "+this.width+"cm");
    }
}
