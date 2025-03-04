package ss04;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so n");
        int n=sc.nextInt();
        int a=0;
        while(true){
           if(n==0){
               break;
           }
           else{
               a+=n;
               System.out.println(a);
               n = sc.nextInt();
           }
        }
        System.out.println(a);
    }
}
