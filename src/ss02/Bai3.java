package ss02;

public class Bai3 {
    public static void main(String[] args) {
        int x=2,y=3;
        boolean bangnhau = x==y;
        boolean khacnhau = x!=y;
        boolean nhohon = x<y;
        boolean lonhon = x>y;
        boolean nhohonbang = x<=y;
        boolean lonhonbang = x>=y;
        System.out.println("x=y"+ bangnhau);
        System.out.println("x!=y"+ khacnhau);
        System.out.println("x>y"+ lonhon);
        System.out.println("x<y"+ nhohon);
        System.out.println("x>=y"+ lonhonbang);
        System.out.println("x<=y"+ nhohonbang);
        if(bangnhau){
            System.out.println("x bang y");
        }
        if(khacnhau){
            System.out.println("x khac y");
        }
        if(lonhon){
            System.out.println("x lon hon y");
        }
        if(nhohon){
            System.out.println("x nho hon y");
        }
        if(lonhonbang){
            System.out.println("x lon hon bang y");
        }
        if(nhohonbang){
            System.out.println("x nho hon bang  y");
        }
        // so sanh double vs string
        double a=1.11;
        String b="1.11";
        if(a==Double.parseDouble(b)){
            System.out.println("a bang b");
        }
        if(a<Double.parseDouble(b)){
            System.out.println("a nho hon b");
        }
        if(a>Double.parseDouble(b)){
            System.out.println("a lon hon b");
        }

    }
}
