import java.util.Scanner;

public class HesapMakinesiSwitchile {
    public static void main(String[] args) {
        int n1,n2,select;

        System.out.print("ilk sayiyi giriniz: ");
        Scanner scan=new Scanner(System.in);
        n1= scan.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        n2= scan.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
        select= scan.nextInt();

        switch (select){
            case 1:
                System.out.println("Sonuc= "+ n1+n2);
                break;
            case 2:
                System.out.println("Sonuc= "+ (n1-n2));
                break;
            case 3:
                System.out.println("Sonuc= "+ n1*n2);
                break;
            case 4:
                System.out.println("Sonuc= "+ (n2==0 ? ("Sıfıra bölünemez"):(n1/n2)));
                break;
            default:
                System.out.println("Hatalı giriş yaptınız..Lutfen 1-4 arası bir işlem seçiniz");
        }

    }
}
