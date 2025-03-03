package ss03;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Khong phai so chan, le");
        } else if (n%2==0) {
            System.out.println("So chan");
        }else{
            System.out.println("So le");
        }
    }
}
