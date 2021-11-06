import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen para miktari giriniz");
        int para=scan.nextInt();
        double onSekizlik=para * 0.18;
        double sekizlikKdv= para * 0.08;

        double sonuc=(para < 1000 && para > 0 )? onSekizlik : sekizlikKdv;
        System.out.println("KDV tutarınız: "+ sonuc +" TL ");

    }
}
