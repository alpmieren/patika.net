package while_for_doWhile;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner scanner=new Scanner(System.in);
        int right=3;
        int balance=1500;
        int select;

        while (right >0 ){
            System.out.print("Kullanıcı adınız: ");
            userName=scanner.nextLine();
            System.out.print("Paralanız: ");
            password=scanner.nextLine();
            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz bankasına hoş geldiniz.");
                do {
                    System.out.println("1- Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select=scanner.nextInt();
                    if (select==1){
                        System.out.print("Para miktarı: ");
                        int price=scanner.nextInt();
                        balance +=price;
                    }else if (select==2){
                        System.out.print("Para miktarı: ");
                        int price=scanner.nextInt();
                        if (price > balance){
                            System.out.println("Bakiye Yetersiz !! ");
                        }else {
                            balance -=price;
                        }
                    }else if (select==3){
                        System.out.println("Bakiyeniz: " + balance);
                    }
                }while (select !=4);
                System.out.println("Tekrar görüşmek üzere ...");
                break;
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan hakkınız: "+ right);
                }
            }
        }

    }
}
