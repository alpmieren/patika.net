package while_for_doWhile;

import java.util.Scanner;

public class UcVeDortTamBolunenSayilar {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi= scan.nextInt();

        for (int i=0; i<=sayi; i++){
            if (i % 12==0){
                System.out.print(i+ ",");
            }
        }
    }
}
