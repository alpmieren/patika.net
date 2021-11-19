package while_for_doWhile;

import java.util.Scanner;

public class TekSayiGirileneKadarDortunKatlariniToplayanProgram {
    public static void main(String[] args) {
        /*
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri
         kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */

        int sayi;
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        do {
            System.out.print("Sayı giriniz: ");
            sayi=scan.nextInt();
            if ((sayi % 4==0)){
                toplam+=sayi;
            }
        }while (sayi % 2==0);
        System.out.println(toplam);
    }
}
