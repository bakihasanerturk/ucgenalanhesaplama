import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a,b,c,u,alan;


        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen 1. Kenarı Giriniz : ");
        a = scan.nextInt();

        System.out.print("Lütfen 2. Kenarı Giriniz : ");
        b = scan.nextInt();

        System.out.print("Lütfen 3. Kenarı Giriniz : ");
        c = scan.nextInt();

        u = (a+b+c)/2;
        System.out.println("Üçgenin Çevresi : " + u*2);

        alan = (int) Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin Alanı : " + alan*alan);
    }
}
