import java.util.Scanner;
public class deneme {
    public static void main(String[] args) {
        int say, miktar = 0, toplam = 0;
        double ort;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Hesaplamak Istediginiz Sayiyi giriniz : ");
        say = input.nextInt();
        System.out.println("Hem 3 ve Hem 4'e Bolunebilen Rakam ve Sayilar :");
        for (int i = 1; i < say; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i + " "); // Kucuk Degerler Verilerek Programin Dogrulugu Olculebilmesi Icin Yazildi!
                toplam += i;
                miktar++;
            }
        }
        ort = toplam/miktar; //Ortalama Hesaplanirken
        System.out.print("Ortalamasi : " + ort);

    }
}
