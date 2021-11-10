import java.util.Scanner;

public class UcakBiletiFiyatHesaplama {
    public static void main(String[] args) {
        int km, age, tripType;
        Scanner scan = new Scanner(System.in);


        System.out.println("Yolculuk mesafesini giriniz.(Km): ");
        km = scan.nextInt();
        System.out.println("Yolcu yaşını giriniz: ");
        age = scan.nextInt();
        System.out.println("Yolculuk tipini seçiniz: \n1-One Way\n2-Round Trip");
        tripType = scan.nextInt();

        double toplamTutar = 0;
        double yasIndirimi = 1;
        double normalPrice = km * 0.10;

        if (km >= 1) {
            if (tripType == 1 || tripType == 2) {
                if (tripType == 1) {
                    if (age >=1 && age <= 12) {
                        yasIndirimi = normalPrice * 0.5;
                        System.out.println("Yas Indirimi= " + yasIndirimi + " TL");
                        double indirimliTutar = normalPrice - yasIndirimi;
                        System.out.println("Toplam Tutar= " + indirimliTutar);
                    } else if (age > 12 && age <= 24) {
                        yasIndirimi = normalPrice * 0.10;
                        System.out.println("Yas Indirimi= " + yasIndirimi + " TL");
                        double indirimliTutar = normalPrice - yasIndirimi;
                        System.out.println("Toplam Tutar= " + indirimliTutar);
                    } else if (age > 65) {
                        yasIndirimi = normalPrice * 0.30;
                        System.out.println("Yas Indirimi= " + yasIndirimi + " TL");
                        double indirimliTutar = normalPrice - yasIndirimi;
                        System.out.println("Toplam Tutar= " + indirimliTutar);
                    } else if (age > 24 && age <= 65) {
                        yasIndirimi = normalPrice * 0;
                        System.out.println("Yas Indirimi= " + yasIndirimi + " TL");
                        double indirimliTutar = normalPrice - yasIndirimi;
                        System.out.println("Toplam Tutar= " + indirimliTutar);
                    }else {
                        System.out.println("Hatali Veri Girdiniz !");
                    }

                } else if (tripType == 2) {
                    if (age>=1 && age <= 12) {
                        yasIndirimi = normalPrice * 0.5;
                        System.out.println("Yas Indirimi= " + yasIndirimi + " TL");
                        double indirimliTutar = normalPrice - yasIndirimi;
                        System.out.println("Indirimli Tutar= " + indirimliTutar);
                        double gidisDonusIndirimi = indirimliTutar * 0.20;
                        System.out.println("Gidiş dönüş indirimi= " + gidisDonusIndirimi);
                        toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
                        System.out.println("Toplam Tutar= " + toplamTutar);
                    } else if (age > 12 && age <= 24) {
                        yasIndirimi = normalPrice * 0.10;
                        System.out.println("Yas Indirimi= " + yasIndirimi + " TL");
                        double indirimliTutar = normalPrice - yasIndirimi;
                        System.out.println("Indirimli Tutar= " + indirimliTutar);
                        double gidisDonusIndirimi = indirimliTutar * 0.20;
                        System.out.println("Gidiş dönüş indirimi= " + gidisDonusIndirimi);
                        toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
                        System.out.println("Toplam Tutar= " + toplamTutar);
                    } else if (age > 65) {
                        yasIndirimi = normalPrice * 0.30;
                        System.out.println("Yas Indirimi= " + yasIndirimi + " TL");
                        double indirimliTutar = normalPrice - yasIndirimi;
                        System.out.println("Indirimli Tutar= " + indirimliTutar);
                        double gidisDonusIndirimi = indirimliTutar * 0.20;
                        System.out.println("Gidiş dönüş indirimi= " + gidisDonusIndirimi);
                        toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
                        System.out.println("Toplam Tutar= " + toplamTutar);
                    }else {
                        System.out.println("Hatali Veri Girdiniz !");
                    }
                }
            } else {
                System.out.println("Hatalı Veri Girdiniz ! ");
            }
        }else {
            System.out.println("Hatalı Veri Girdiniz ! ");
        }
    }
}
