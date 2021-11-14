import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int dogumTarihi;

        System.out.print("Dogum yılınızı giriniz: ");
        Scanner scan=new Scanner(System.in);
        dogumTarihi=scan.nextInt();

        if (dogumTarihi % 12 == 0){
            System.out.println("Çin zodyağı burcunuz: MAYMUN");
        }else if (dogumTarihi % 12 ==1){
            System.out.println("Çin zodyağı burcunuz: HOROZ");
        }else if (dogumTarihi % 12 ==2) {
            System.out.println("Çin zodyağı burcunuz: KÖPEK");
        }else if (dogumTarihi % 12 ==3){
            System.out.println("Çin zodyağı burcunuz: DOMUZ");
        }else if (dogumTarihi % 12 ==4) {
            System.out.println("Çin zodyağı burcunuz: FARE");
        }else if (dogumTarihi % 12 ==5) {
            System.out.println("Çin zodyağı burcunuz: ÖKÜZ");
        }else if (dogumTarihi % 12 ==6) {
            System.out.println("Çin zodyağı burcunuz: KAPLAN");
        }else if (dogumTarihi % 12 ==7){
            System.out.println("Çin zodyağı burcunuz: TAVŞAN");
        }else if (dogumTarihi%12 ==8){
            System.out.println("Çin zodyağı burcunuz: EJDERHA");
        }else if (dogumTarihi % 12 ==9) {
            System.out.println("Çin zodyağı burcunuz: YILAN");
        }else if (dogumTarihi % 12==10) {
            System.out.println("Çin zodyağı burcunuz: AT");
        }else if (dogumTarihi % 12 ==11){
            System.out.println("Çin zodyağı burcunuz: KOYUN");
        }else {
            System.out.println("hatalı giriş yaptınız");
        }
    }
}
