package ss02;

public class Bai4 {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        boolean c=true;
        if(a&&b==true){
            System.out.println("ca 2 deu dung");
        }
        if(a||b==true){
            System.out.println("it nhat 1 dung");
        }
        if(a==false&&b==true){
            System.out.println("khong dung");
        }
        if(c == true){
            System.out.println("c la true");
        }else {
            System.out.println("c la false");
        }

        c = !c ;
    }
}
