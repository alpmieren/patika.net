package while_for_doWhile;

import java.util.Scanner;

public class EbobEkokWithWhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1=input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2=input.nextInt();
        int i=1;
        int ebob=1;

        while (n1 >=i && n2 >=i){
            if (n1 % i==0 && n2 % i==0)
            ebob=i;
            i++;
        }
        System.out.println(ebob);

        System.out.println("========");

        int j=1;
        while (j <= (n1 * n2)){
            if (j % n1==0 && j %n2==0) {
                System.out.println(j);
                break;
            }
            j++;
        }

    }
}
