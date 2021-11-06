import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz: ");
        double kilo= scan.nextDouble();
        System.out.println("Lutfen boyunuzu(m cinsinden) giriniz: ");
        double boy= scan.nextDouble();

        double kitleIndeksi=kilo / (boy*boy);

        System.out.println("Vücut kitle indeksiniz : "+ kitleIndeksi);
    }
}
