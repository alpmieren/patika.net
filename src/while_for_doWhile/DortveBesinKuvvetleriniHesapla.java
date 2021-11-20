package while_for_doWhile;

import java.util.Scanner;

public class DortveBesinKuvvetleriniHesapla {
    public static void main(String[] args) {
        /*
        Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
         */

        System.out.print("Lutfen bir sayi giriniz: ");
        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();

        for (int i=1; i<=sayi; i*=5){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int j=1; j<=sayi; j*=4){
            System.out.print(j+" ");
        }
    }
}
