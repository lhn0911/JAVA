package ss04;

import java.util.Scanner;

public class Bai1 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n");
        int n = sc.nextInt();
        int a=0;
        if(n<=0){
            System.out.println("So n khong hop le");
        }
        else{
            for(int i=1;i<=n;i++){
                a+=i;
            }
            System.out.println(a);
        }
    }
}
