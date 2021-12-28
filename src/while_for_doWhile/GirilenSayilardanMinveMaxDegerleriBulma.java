package while_for_doWhile;

import java.util.Scanner;

public class GirilenSayilardanMinveMaxDegerleriBulma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int count=scan.nextInt();
        int i=0;
        int max=0;
        int min=0;
        int sayi;
        while (i<count){
            System.out.print(i+1+". sayıyı giriniz: ");
            sayi=scan.nextInt();
            i++;
            if(i==1){
                min=sayi;
                max=sayi;
            }if (sayi>max)
                max=sayi;
            if (sayi<min)
                min=sayi;

        }
        System.out.println("En büyük : "+ max);
        System.out.println("En küçük sayı : "+ min);
    }
}
