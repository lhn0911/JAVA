package ss02;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap canh b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap canh c: ");
        double c = scanner.nextDouble();
        double chuVi = a + b + c;
        double p = chuVi / 2;
        double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Chu vi tam giac: " + chuVi);
        System.out.println("Dien tich tam giac: " + dienTich);

        scanner.close();
    }
}
