package bankaUygulama;

import java.util.Scanner;

public class BankaUygulama {

    static Scanner sc= new Scanner(System.in);
    static int hesaptakiPara =0;
    public static void main(String[] args) {
        String adSoyad;
        int secenek;

        adSoyad=adSoyadAl();
        do {
            menu();
            secenek = secenekAl();
            secenekKontrol(secenek);
            if (secenek==4){
                break;
            }
            menuyeYonlendirme();
        }while(secenek!=4);
    }

    public static String  adSoyadAl() {

        String ad;
        String soyad;
        System.out.print("adını gir: ");
        ad = sc.next();
        System.out.print("soyadını gir: ");
        soyad= sc.next();
        return ad+" "+soyad;

    }

    public static void menu() {
        System.out.println("MENU");
        System.out.println("1) para yatırma");
        System.out.println("2) para cekme");
        System.out.println("3) bakıye sorgulama\n4) cıkıs");
        System.out.println(" ");
    }

    public static  int secenekAl() {

        int secenek;
        System.out.print("bir secenek sec: ");
        secenek=sc.nextInt();
        return secenek;

    }

    public static void secenekKontrol(int secenek) {
        if (secenek==1){
            paraYatirma();
        }
        else if (secenek==2) {
            paraCekme();
        }
        else if (secenek==3){
            bakiyeSorgulama();
        }
        else{
            cikis();
        }

    }

    public static void paraYatirma() {
        int yatırılanPara;
        System.out.println("hesabınızda ki toplam para: "+ hesaptakiPara);

        do {
            System.out.print("yatırmak istediginiz para: ");
            yatırılanPara= sc.nextInt();

            if (yatırılanPara<0){
                System.out.println("yanlış miktar girdiniz tekrar deneyiniz");
            }
        }while (yatırılanPara<0);

        hesaptakiPara = hesaptakiPara+yatırılanPara;
        System.out.println("hesabınıza para yatırıldı. şu an ki paranız: "+ hesaptakiPara);




    }
    public static void paraCekme() {

        int cekilenPara;
        do {
            System.out.print("çekmek istediginiz miktar: ");
            cekilenPara = sc.nextInt();
            if (cekilenPara>hesaptakiPara){
                System.out.println("tekrar deneyin");
            }
        }while (cekilenPara>hesaptakiPara);
        hesaptakiPara= hesaptakiPara-cekilenPara;
        System.out.println("suan ki bakiyeniz: "+ hesaptakiPara);
    }
    public static void bakiyeSorgulama() {
        System.out.println("hesabınızda ki para: "+hesaptakiPara);


    }
    public static void cikis() {
        System.out.println("Allaha emanet olun");
    }

    public static void menuyeYonlendirme() {
        System.out.println("menuye yonlendiriliyorsunuz...");
    }


}
