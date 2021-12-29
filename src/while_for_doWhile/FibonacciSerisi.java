package while_for_doWhile;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        /*
        Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
         */
        System.out.print("fibonacci serisi için eleman sayısı giriniz : ");
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();

        int k=0;
        int n=1;
        System.out.print(k+ " ");
        System.out.print(n+ " ");
        int toplam;
        for (int i=1; i<sayi; i++){
            toplam=n+k;
            k=n;
            n=toplam;
            System.out.print(toplam + " ");
        }

    }
}
