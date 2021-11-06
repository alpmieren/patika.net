import java.util.Scanner;

public class DaireDilimiAlanHesabi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Dairenin yaricapini giriniz: ");
        double r=scan.nextDouble();
        System.out.print("Daire diliminin acisini giriniz: ");

        double a= scan.nextDouble();
        double piSayisi=3.14;

        double daireAlan=(piSayisi *(r*r)* a) / 360;

        System.out.println("Daire diliminin alani = " + daireAlan);
    }
}
