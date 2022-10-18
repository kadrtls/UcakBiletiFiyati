import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km,age,direction,perkm=1;
        double pay;
        Scanner scanner=new Scanner(System.in);
        System.out.println("uçağın gideceği mesafeyi(km) giriniz:");
        km= scanner.nextInt();
        System.out.println("yaşınızı giriniz:");
        age= scanner.nextInt();
        System.out.println("bilet türünü seçin 1=>tek yön 2=>gidiş dönüş");
        direction= scanner.nextInt();

        pay=km*perkm;
        if (age<12){
            pay/=2;
        } else if (12<=age&&age<=24) {
            pay=pay-(pay * 0.10);
        } else if (24<age&&age<65) {
            pay=pay;
        }else {
            pay=pay-(pay * 0.30);
        }

        if (direction==1){
            System.out.println("Toplam Tutar:"+pay+" TL");
        }else {
            System.out.println("Toplam Tutar:"+(pay=pay-pay*0.20)*2+" TL");
        }
    }
}