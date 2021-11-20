package while_for_doWhile;

import java.util.Scanner;

public class ForDongusuIleUsluSayiHesabi {
    public static void main(String[] args) {
        /*
        Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
         */
        int x,y;
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayiyi giriniz: ");
        x= scan.nextInt();
        System.out.print("Almak istediginiz üs sayisini giriniz: ");
        y= scan.nextInt();
        int total=1;
        for (int i=1; i<=y; i++){
            total*=x;
        }
        System.out.println(x+" in "+y+". kuvveti "+total);
    }
}
