import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gideceginiz yolun KM uzunlugunu giriniz.");

        Double uzunluk= scan.nextDouble();
        double ucret=10+(uzunluk * 2.20);
        double sonuc=ucret <= 20 ? 20:ucret;
        System.out.println("Odeyeceginiz tutar= "+sonuc);

    }
}
