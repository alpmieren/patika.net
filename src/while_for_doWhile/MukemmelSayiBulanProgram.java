package while_for_doWhile;

import java.util.Scanner;

public class MukemmelSayiBulanProgram {
    public static void main(String[] args) {
        /*
        Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı
         ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
toplamı kendisine eşit olan sayıya mükemmel sayı denir.
         */
        System.out.print("Bir sayi giriniz: ");
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
        int toplam=0;

        for (int i=1; i<sayi; i++){
            if (sayi%i==0){
                toplam+=i;
            }
        }
        if (toplam==sayi){
            System.out.println(sayi+" mükemmel bir sayıdır..");
        }else {
            System.out.println(sayi+ " mükemmel sayı değildir...");
        }
    }
}
