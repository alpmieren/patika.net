package while_for_doWhile;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1=input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2=input.nextInt();
        int ebob=1;
        for (int i=1; i<=n1; i++) {
            if (n1 % i ==0 && n2 % i ==0){
                ebob=i;
            }
        }
        System.out.println(ebob);

        System.out.println("===========");

        for(int j=1; j <=(n1*n2); j++){
            if (j % n1==0 && j %n2==0){
                System.out.println(j);
                break;
            }
        }
    }
}
