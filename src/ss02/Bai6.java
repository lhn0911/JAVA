package ss02;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        String name =  sc.nextLine();
        System.out.println("Nhap diem mon 1:");
        double point1 = sc.nextDouble();
        System.out.println("Nhap diem mon 2:");
        double point2 = sc.nextDouble();
        System.out.println("Nhap diem mon 3:");
        double point3 = sc.nextDouble();
        double pointTB = (point1+point2+point3)/3;
        System.out.println("Diem trung binh: "+pointTB);
        String rating;
        rating = pointTB < 5 ? "Yeu": 5< pointTB && pointTB <6.5?"Trung binh":6.5 < pointTB && pointTB<8?"Kha":"Gioi";
        System.out.println("Ten hoc sinh:"+name+" Diem trung binh: "+pointTB+" Xep loai: "+rating);
    }
}
