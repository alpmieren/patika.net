package if_Else;

import java.util.Scanner;

public class KullaniciGirisiOlusturma {
    public static void main(String[] args) {
        String userName,password,newPassword,select;

        Scanner scan=new Scanner(System.in);
        System.out.print("kullanici adiniz: ");
        userName= scan.nextLine();
        System.out.print("şifreniz : ");
        password= scan.next();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş başarılı..");
        } else {
            System.out.println("Bilgileriniz yanlış..");
            System.out.println("Şifrenizi sifirlamak istiyor musunuz? (Y,N)");
            select= scan.next();
            if (select.toLowerCase().equals("y")){
                System.out.print("Lutfen yeni şifrenizi girinizi: ");
                newPassword= scan.next();
                if (newPassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı , lütfen başka şifre giriniz");
                }else {
                    System.out.println("Yeni şifreniz oluşturuldu.");
                }
            }else if (select.toLowerCase().equals("n")){
                System.out.println("Çıkışınız gerçekleştirildi.");
            }else {
                System.out.println("Hatalı giriş yaptınız");
            }
        }
    }
}
