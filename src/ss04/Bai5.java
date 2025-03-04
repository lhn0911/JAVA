package ss04;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Cac so hoan hoa nho hon "+n+" la ");
        for (int i = 1; i <= n-1; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.print(i+" ");
            }
        }
    }
}
