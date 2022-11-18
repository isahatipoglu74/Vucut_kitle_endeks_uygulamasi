import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);


        double boy,kilo;
        System.out.print("Boyunuzu metre cinsinden giriniz=");
        boy=inp.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz=");
        kilo=inp.nextDouble();
        System.out.print("Vücut kitle endeksiniz="+((kilo)/(boy*boy)));
    }
}