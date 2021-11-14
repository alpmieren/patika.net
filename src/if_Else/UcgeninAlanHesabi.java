package if_Else;

import java.util.Scanner;

public class UcgeninAlanHesabi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz..");
        double a=scan.nextDouble();
        double b= scan.nextDouble();
        double c= scan.nextDouble();

        double u=(a+b+c) / 2;
        double ucgeninAlanKaresi=u *(u-a)* (u-b)*(u-c);
        double ucgenAlan=Math.pow(ucgeninAlanKaresi,0.5);
        System.out.println("ucgenin alani= "+ ucgenAlan);

    }
}
