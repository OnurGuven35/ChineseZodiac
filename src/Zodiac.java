import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year, zod;
        String burc;

        System.out.print("Lutfen Dogdugunuz Yili Giriniz : ");
        year = input.nextInt();

        zod = year % 12;

        if (zod >= 0) {
            if (zod == 0) {
                burc = "Maymun";
            } else if (zod == 1) {
                burc = "Horoz";
            } else if (zod == 2) {
                burc = "Kopek";
            } else if (zod == 3) {
                burc = "Domuz";
            } else if (zod == 4) {
                burc = "Fare";
            } else if (zod == 5) {
                burc = "Okuz";
            } else if (zod == 6) {
                burc = "Kaplan";
            } else if (zod == 7) {
                burc = "Tavsan";
            } else if (zod == 8) {
                burc = "Ejderha";
            } else if (zod == 9) {
                burc = "Yilan";
            } else if (zod == 10) {
                burc = "At";
            } else {
                burc = "Koyun";
            }

            System.out.print("Cin Zodyagi Burcunuz : " + burc);

        } else {
            System.out.print("Hatali Deger Girdiniz Lutfen Tekrar Deneyeniz ! ");
        }
    }
}
