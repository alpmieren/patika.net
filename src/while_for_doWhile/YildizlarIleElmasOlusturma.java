package while_for_doWhile;

import java.util.Scanner;

public class YildizlarIleElmasOlusturma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Basamak sayisini giriniz: ");
        int n=scanner.nextInt();

        for (int i=1; i<=n; i++){
            for (int k=1; k<=(n-i); k++){
                System.out.print(" ");
            }
            for(int j=1; j<= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int m=n; m>0; m--) {
            for(int p=m; p<n; p++) {
                System.out.print(" ");
            }
            for (int r=1; r<=(2*m)-1; r++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
