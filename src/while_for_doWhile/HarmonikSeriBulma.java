package while_for_doWhile;

import java.util.Scanner;

public class HarmonikSeriBulma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi= scan.nextInt();
        double total=0;

        for (double i=1; i<=sayi; i++){
                total+=(1/i);
        }
        System.out.println(total);
    }
}
