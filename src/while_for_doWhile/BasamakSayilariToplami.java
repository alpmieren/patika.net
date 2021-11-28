package while_for_doWhile;

import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        /*
        bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        örnek: 1643=1+6+4+3=14
         */
        int sayi;
        System.out.print("Lutfen bir sayi giriniz: ");
        Scanner scanner = new Scanner(System.in);
        sayi = scanner.nextInt();

        int result=0;
        int ekle;

        while (sayi !=0){
            ekle =sayi % 10;
            sayi /= 10;
            result +=ekle;
        }
        System.out.println("Gridiğiniz sayının basamak değerleri toplamı= "+result);


    }
}
