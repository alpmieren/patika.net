package if_Else;

import java.util.Scanner;

public class SinifGecmeDurumunuHesaplayanProgram {
    public static void main(String[] args) {
        int matematik,fizik,turkce,kimya,muzik,sonuc;
        Scanner scan=new Scanner(System.in);
        System.out.print("matematik notunuzu giriniz: ");
        matematik= scan.nextInt();
        System.out.print("fizik notunuzu giriniz: ");
        fizik= scan.nextInt();
        System.out.print("turkce notunuzu giriniz: ");
        turkce=scan.nextInt();
        System.out.print("kimya notunuzu giriniz: ");
        kimya= scan.nextInt();
        System.out.print("muzik notunuzu giriniz: ");
        muzik= scan.nextInt();
        sonuc=(matematik+fizik+turkce+kimya+turkce) / 5;

        if ((matematik>=0 && matematik<=100) && (turkce>=0 || turkce<=100) && (fizik>=0 && fizik<=100) &&
        (kimya>=0 && kimya<=100) && (muzik>=0 && muzik<=100)) {
            if (sonuc>=55){
                System.out.println("Geçti");
            }else {
                System.out.println("Kaldı");
            }
        }else {
            System.out.println("Lutfen gecerli notlar giriniz");
        }

    }
}
