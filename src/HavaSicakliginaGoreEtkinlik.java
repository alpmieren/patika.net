import java.util.Scanner;

/*
Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 */
public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        int sicaklik;
        Scanner scan=new Scanner(System.in);
        System.out.print("Hava sicakligini giriniz: ");

        sicaklik=scan.nextInt();

        if (sicaklik<=5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if (sicaklik>=10 && sicaklik <=15){
            System.out.println("Sinemaya ya da pikniğe gidebilirsiniz.");
        }else if ((sicaklik>5 && sicaklik<10)){
            System.out.println("Sinemaya gidebilirsiniz");
        }else if (sicaklik>15 && sicaklik<=25){
            System.out.println("Pikniğe gidebilirsiniz");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}
