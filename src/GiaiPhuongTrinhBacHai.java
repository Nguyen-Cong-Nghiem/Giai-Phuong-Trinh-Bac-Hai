import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac hai");
        System.out.println("Hay nhap vao phuong trinh co dang a*x^2+b*x+c");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri a = ");
        float a = sc.nextFloat();
        System.out.println("Nhap gia tri b = ");
        float b = sc.nextFloat();
        System.out.println("Nhap gia tri c = ");
        float c = sc.nextFloat();
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh vo nghiem");
            }else{
                double x;
                x=-c/b;
                System.out.println("Phuong trinh co nghiem la: "+x);
        }
        }else{
            float delta;
            delta=(b*b)-(4*a*c);
            if(delta<0){
                System.out.println("Phuong trinh vo nghiem");
            }else if(delta>0){
                float x1;
                x1 = (float)(-b + Math.sqrt(delta))/(2*a);
                float x2;
                x2 = (float)(-b - Math.sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co 2 nghiem la: "+"x1= "+x1 + "va"+ "x2= "+x2);

            }else if(delta==0){
                float x1= (-b/2*a);
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x1);
            }
        }
    }
}
