package if_Else;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {

        int yil;
        System.out.print("Yıl giriniz: ");
        Scanner scan=new Scanner(System.in);
        yil = scan.nextInt();
        if (yil % 4 ==0){
            if ((yil %400 ==0) && (yil % 100==0)){
                System.out.println(yil +" bir artık yıldır..");
            }else if ((yil % 400 !=0) && (yil % 100==0)){
                System.out.println(yil + " bir artık yıl değildir..");
            }else {
                System.out.println(yil+ " bir artık yıldır.");
            }
        }else {
            System.out.println(yil + " artık yıl değildir.");
        }
    }
}
