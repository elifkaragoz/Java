
import java.util.Scanner;

public class HipotenüsüHesaplayanProgram 
{
    public static void main(String[] args)
    {
        int aKenari, bKenari;
        double Hipotenus;

        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin 1. ve 2. Kenarlarini Giriniz: ");
        aKenari = input.nextInt();
        bKenari = input.nextInt();

        Hipotenus = Math.sqrt((aKenari * aKenari) + (bKenari * bKenari));

        System.out.println("Hipotenüs: " + Hipotenus);
    }

}
