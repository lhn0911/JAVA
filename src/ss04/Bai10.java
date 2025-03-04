package ss04;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Kiem tra so nguyen to");
            System.out.println("2. Kiem tra so hoan hao");
            System.out.println("3. Tim va tinh tong tat ca cac uoc cua mot so");
            System.out.println("4. Thoat chuong trinh");
            System.out.print("Chon chuc nang: ");
            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Thoat chuong trinh.");
                break;
            }

            System.out.print("Nhap mot so: ");
            int n = sc.nextInt();

            switch (choice) {
                case 1:
                    boolean isPrime = true;
                    if (n < 2) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i * i <= n; i++) {
                            if (n % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    System.out.println(n + (isPrime ? " la so nguyen to." : " khong phai so nguyen to."));
                    break;
                case 2:
                    int sum = 0;
                    for (int i = 1; i < n; i++) {
                        if (n % i == 0) {
                            sum += i;
                        }
                    }
                    System.out.println(n + (sum == n ? " la so hoan hao." : " khong phai so hoan hao."));
                    break;
                case 3:
                    int sumUoc = 0;
                    System.out.print("Cac uoc cua " + n + " la: ");
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0) {
                            System.out.print(i + " ");
                            sumUoc += i;
                        }
                    }
                    System.out.println("\nTong cac uoc: " + sumUoc);
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai.");
            }
        }
        sc.close();
    }
}
