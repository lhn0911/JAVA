package ss04;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println(n + " khong phai so nguyen to");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.println(n + " khong phai so nguyen to");
                    return;
                }
            }
            System.out.println(n + " la so nguyen to");
        }
    }
}
