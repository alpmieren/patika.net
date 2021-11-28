package while_for_doWhile;

import java.util.Scanner;

public class ArmstrongSayiHesaplama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int number=scanner.nextInt();
        int basNumber=0, tempNumber=number, basValue , result=0 , basPow;

        while (tempNumber != 0){
            tempNumber /=10;
            basNumber++;
        }

        tempNumber=number;
        while (tempNumber != 0){
            basValue = tempNumber % 10;
            basPow=1;
            for (int i=1; i<=basNumber; i++ ){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /=10;
        }
        System.out.println(result);

        if (result==number){
            System.out.println("Bir Armstrong sayisidir.");
        }else {
            System.out.println("Bir Armstrong sayi değildir");
        }

    }
}
