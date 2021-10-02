import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    //if else kullanılmayacak.
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik;

        System.out.println("lutfen matematik notunu giriniz");
        Scanner scan=new Scanner(System.in);
        matematik= scan.nextInt();
        System.out.println("lutfen fizik notunu giriniz");
        fizik= scan.nextInt();
        System.out.println("lutfen kimya notunu giriniz");
        kimya= scan.nextInt();
        System.out.println("lutfen turkce notunu giriniz");
        turkce= scan.nextInt();
        System.out.println("lutfen tarih notunu giriniz");
        tarih= scan.nextInt();
        System.out.println("lutfen muzik notunu giriniz");
        muzik= scan.nextInt();

        double ort =(matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("ogerncinin not ortalaması: "+ ort);
        String sonuc=ort>60 ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println(sonuc);

    }
}
