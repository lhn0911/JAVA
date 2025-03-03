package ss03;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap diem trung binh cua sinh vien: ");
        double diem = scanner.nextDouble();

        if (diem < 0.0 || diem > 10.0) {
            System.out.println("Diem khong hop le");
        } else if (diem >= 8.5) {
            System.out.println("Xep loai: Gioi");
        } else if (diem >= 6.5) {
            System.out.println("Xep loai: Kha");
        } else if (diem >= 5.0) {
            System.out.println("Xep loai: Trung binh");
        } else {
            System.out.println("Xep loai: Yeu");
        }
    }
}
