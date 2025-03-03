package ss03;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap canh thu nhat: ");
        int a = sc.nextInt();

        System.out.print("Nhap canh thu hai: ");
        int b = sc.nextInt();

        System.out.print("Nhap canh thu ba: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Tam giac deu");
            } else if (a == b || b == c || a == c) {
                System.out.println("Tam giac can");
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Tam giac vuong");
            } else {
                System.out.println("Tam giac thuong");
            }
        } else {
            System.out.println("Ba canh khong tao thanh tam giac.");
        }
    }
}
