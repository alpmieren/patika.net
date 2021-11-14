package while_for_doWhile;

import java.util.Scanner;

public class passwordControl {
    public static void main(String[] args) {
        int password;
        boolean isPasswordSuccess= false;

        Scanner scan=new Scanner(System.in);

        while (!isPasswordSuccess){
            System.out.print("Şifre giriniz: ");
            password= scan.nextInt();
            if (password==123){
                System.out.println("Şifre doğru");
                isPasswordSuccess=true;
            }else {
                System.out.println("Şifre Yanlış !");
            }
        }
    }
}
