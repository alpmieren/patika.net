package while_for_doWhile;

import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {
        /*
        Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
         */
        System.out.print("Olusturulacak ters üçgen için basamak sayısını giriniz : ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for (int m=n; m>0; m--) {
            for(int p=m; p<n; p++) {
                System.out.print(" ");
            }
            for (int r=1; r<=(2*m)-1; r++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
