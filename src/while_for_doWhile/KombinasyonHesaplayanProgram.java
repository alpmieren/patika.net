package while_for_doWhile;

import java.util.Scanner;

public class KombinasyonHesaplayanProgram {
    public static void main(String[] args) {
        /*
        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
        N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        Java ile kombinasyon hesaplayan program yazınız.
         */
        int n,r;
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen kümenin eleman sayisini giriniz: ");
        n= scan.nextInt();
        System.out.print("Lutfen olusturmak istediğiniz grupların sayisini giriniz: ");
        r= scan.nextInt();

        int nFaktoriyel=1;
        for (int i=1; i<=n; i++){
            nFaktoriyel*=i;
        }
        int rFaktoriyel=1;
        for (int j=1; j<=r; j++){
            rFaktoriyel*=j;
        }
        int farklariFaktoriyel=1;
        for (int k=1; k<=(n-r); k++){
            farklariFaktoriyel*=k;
        }
        double kombinasyonHesabi=nFaktoriyel/(rFaktoriyel*(farklariFaktoriyel));
        System.out.println("olusturulabilecek kombinasyon sayisi= "+kombinasyonHesabi);

    }
}
