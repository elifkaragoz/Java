
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args)
    {
        int select, nb1, nb2;

        Scanner inp = new Scanner(System.in);
        System.out.println("Yapmak istediğiniz işlemin numarasını girin: ");
        System.out.println("1 - Toplama ");
        System.out.println("2 - Cıkarma ");
        System.out.println("3 - Carpma ");
        System.out.println("4 - Bolme ");
        select = inp.nextInt();

        System.out.print("Yapmak istediğiniz işlemin için ilk sayıyı girin: ");
        nb1 = inp.nextInt();
        System.out.print("Yapmak istediğiniz işlemin için 2. sayıyı girin: ");
        nb2 = inp.nextInt();

        switch(select)
        {
            case 1 : System.out.print("İşleminizin Sonucu: " + (nb1 + nb2));
                break;
            case 2 : System.out.print("İşleminizin Sonucu: " + (nb1 - nb2));
                break;
            case 3 : System.out.print("İşleminizin Sonucu: " + (nb1 * nb2));
                break;
            case 4 : System.out.print("İşleminizin Sonucu: " + (nb1 / nb2));
                break;
        }
    }
}
