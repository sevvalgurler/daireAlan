import java.util.Scanner;
public class ortalama {
    public static void main(String[] args){
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner inp =new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        mat= inp.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik= inp.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya= inp.nextInt();

        System.out.println("Turkce notunuz: ");
        turkce= inp.nextInt();

        System.out.println("Tarih notunuz: ");
        tarih= inp.nextInt();

        System.out.println("Muzik notunuzu: ");
        muzik= inp.nextInt();

        int toplam =(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız: " +sonuc);


        String durum = ( sonuc >=60) ? "Gecti" : "Kaldı" ;
        System.out.println("Durum: " + durum);

    }
}
