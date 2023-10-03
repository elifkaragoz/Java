
import java.util.Scanner;

public class DaireninAlanVeCevresi
{
    public static void main(String[] args)
    {
        int r;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin Yari Capini Girin: ");
        r = inp.nextInt();

        double alan = (pi * r * r);
        double cevre = (2 * pi * r);

        System.out.println("Dairenin Cevresi: " + cevre);
        System.out.println("Dairenin Alani: " + alan);
    }    
}
