import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int sayi = input.nextInt();
        int total = 0, basNumber = 0
        while(number != 0) {

            total += (number % 10);
            number /= 10;
            basNumber++;
        }
        System.out.print("Basamak Sayılarının Toplamı :" + total);
        System.out.print("Basamak Sayısı :" + basNumber);
    }

    
}
