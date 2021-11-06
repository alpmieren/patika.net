import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5;

        System.out.print("kac kilo armut aldiginizi girinizi .. ");
        double armutKilo= scan.nextDouble();
        System.out.print("kac kilo elma aldiginizi girinizi .. ");
        double elmaKilo= scan.nextDouble();
        System.out.print("kac kilo domates aldiginizi girinizi .. ");
        double domatesKilo= scan.nextDouble();
        System.out.print("kac kilo muz aldiginizi girinizi .. ");
        double muzKilo= scan.nextDouble();
        System.out.print("kac kilo patlican aldiginizi girinizi .. ");
        double patlicanKilo= scan.nextDouble();


        double toplamTutar=armut*armutKilo+ elma*elmaKilo+ domates*domatesKilo+muz*muzKilo + patlican*patlicanKilo;

        System.out.println(armutKilo + "kg Armut\n"+elmaKilo+"kg Elma\n"+domatesKilo+"kg Domates\n"
                +muzKilo+"kg Muz\n"+patlicanKilo+"kg Patlican\n"+"Toplam Tutar : "+toplamTutar);
    }
}
