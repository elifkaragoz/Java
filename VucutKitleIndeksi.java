
//Kilo (kg) / Boy(m) * Boy(m)

import java.util.Scanner;

public class VucutKitleIndeksi 
{
    public static void main(String[] args)
    {
        double kg, boy, indeks;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu Girin (metre): ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu Girin: ");
        kg = input.nextDouble();

        indeks = kg / (boy * boy);
        System.out.print("Indeksiniz: " + indeks);
    }    
}
