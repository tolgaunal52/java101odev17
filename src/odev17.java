import java.util.Scanner;

public class odev17 {
    public static void main(String[] args) {
        int a, i=0,topla=0,d=0,say=0,ortala;

        Scanner input = new Scanner(System.in);

        System.out.println("Girilen Sayinin 3 ve 4 'e Tam bolunen Sayilarin Ortalamasini Alma");

        System.out.print("Lutfen Sayiyi Girin : ");
        a = input.nextInt();

        for (i = 1; i <= a; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                topla+=i;
                say++;
            }
        }
        ortala = topla/say;
        System.out.println("Ortalamasi : " + ortala);
    }
}
