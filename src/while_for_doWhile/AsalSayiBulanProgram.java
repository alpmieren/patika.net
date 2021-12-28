package while_for_doWhile;

public class AsalSayiBulanProgram {
    public static void main(String[] args) {
        /*
        Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
         */

        int sayac = 0;
        for(int i=2; i<=100;i++) {
            int kontrol = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    kontrol = 1;
                    break;
                }
            }
            if(kontrol==0) {
                System.out.print(i+" ");
                sayac++;
            }
        }
    }
}
