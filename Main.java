import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Değişkenleri yazalım.
        double yaricapi, cevre, alan, aci;
        double pi=3.14;

        //Kullanıcıdan Yarıçapı alalım.
Scanner inp=new Scanner(System.in);
System.out.print( "Dairenin Yarı Çapını Giriniz:");
yaricapi=inp.nextDouble();
cevre= 2*pi*yaricapi;
System.out.println( "Dairenin Çevresi: " + cevre);
alan=pi*yaricapi*yaricapi;
System.out.println( "Dairenin Alanı:" +alan);

        //Daire dilimi alanı için kullanıcıdan açı isteyelim.
        System.out.print( "Daire Diliminin Açısını yazınız:");
        aci=inp.nextDouble();
        double dilimAlani= (pi*(yaricapi*yaricapi)*aci)/360;
        System.out.print( "Dilimin Alanı:" +dilimAlani);

    }
}
