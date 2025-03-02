package ss02;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai");
        double width = sc.nextDouble();
        System.out.println("Nhap vao chieu rong");
        double height = sc.nextDouble();
        System.out.println("Dien tich hinh chu nhat la: "+(width*height));
        System.out.println("Chu vi hinh chu nhat la: "+2*(width+height));
    }
}
