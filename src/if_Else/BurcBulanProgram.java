package if_Else;

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        /*
        Koç Burcu : 21 Mart - 20 Nisan

        Boğa Burcu : 21 Nisan - 21 Mayıs

        İkizler Burcu : 22 Mayıs - 22 Haziran

        Yengeç Burcu : 23 Haziran - 22 Temmuz

        Aslan Burcu : 23 Temmuz - 22 Ağustos

        Başak Burcu : 23 Ağustos - 22 Eylül

        Terazi Burcu : 23 Eylül - 22 Ekim

        Akrep Burcu : 23 Ekim - 21 Kasım

        Yay Burcu : 22 Kasım - 21 Aralık

        Oğlak Burcu : 22 Aralık - 21 Ocak

        Kova Burcu : 22 Ocak - 19 Şubat

        Balık Burcu : 20 Şubat - 20 Mart
         */

        int day,month;
        Scanner scan=new Scanner(System.in);
        System.out.print("Dogdugunuz ayı giriniz: ");
        month= scan.nextInt();
        System.out.print("Dogdugunuz gunu giriniz: ");
        day= scan.nextInt();

        if (month==1 && (day >0 && day <=31)){
            if (day<=21){
                System.out.println("oğlak burcu");
            }else{
                System.out.println("Kova burcu");
            }
        }else if (month==2 && (day>0 && day<=29)){
            if (day<=19) {
                System.out.println("Kova Burcu");
            }else {
                System.out.println("Balık Burcu");
            }
        }else if (month==3 && (day>0 && day<=31)){
            if (day<=20){
                System.out.println("Balık Burcu");
            }else {
                System.out.println("Koç Burcu");
            }
        }else if (month==4 && (day>0 && day<=30)){
            if (day<=20){
                System.out.println("Koç Burcu");
            }else {
                System.out.println("Boğa Burcu");
            }
        }else if (month==5 && (day>0 && day<=31)){
            if (day<=21){
                System.out.println("Boğa Burcu");
            }else {
                System.out.println("İkizler Burcu");
            }
        }else if (month==6 && (day>0 && day<=30)){
            if (day<=23){
                System.out.println("İkizler Burcu");
            }else {
                System.out.println("Yengeç Burcu");
            }
        }else if (month==7 && (day>0 && day<=31)){
            if (day<=22){
                System.out.println("Yengeç Burcu");
            }else {
                System.out.println("Aslan Burcu");
            }
        }else if (month==8 && (day>0 && day <=31)){
            if (day<=22){
                System.out.println("Aslan Burcu");
            }else {
                System.out.println("Başak Burcu");
            }
        }else if (month==9 && (day>0 && day<=30)){
            if (day<=22){
                System.out.println("Başak Burcu");
            }else {
                System.out.println("Terazi Burcu");
            }
        }else if (month==10 && (day>0 && day<=31)){
            if (day<=22){
                System.out.println("Terazi Burcu");
            }else {
                System.out.println("Akrep Burcu");
            }
        }else if (month==11 && (day>0 && day<=30)){
            if (day<=21) {
                System.out.println("Akrep Burcu");
            }else {
                System.out.println("Yay Burcu");
            }
        }else if (month==12 && (day>0 && day<=31)){
            if (day<=21){
                System.out.println("Yay Burcu");
            }else {
                System.out.println("Oğlak Burcu");
            }
        }else {
            System.out.println("Hatalı giriş yaptınız..");
        }

    }
}
