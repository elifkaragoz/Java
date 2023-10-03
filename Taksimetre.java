
//Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
//Taksimetre KM başına 2.20 TL tutmaktadır.
//Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
//Taksimetre açılış ücreti 10 TL'dir.

import java.util.Scanner;

public class Taksimetre 
{
    public static void main(String[] args)
    {
        int mesafe;
        double total = 10;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi KM Cinsinden Giriniz: ");
        mesafe = input.nextInt();
        
        total += (mesafe * 2.20);
        total = (total < 20) ? 20 : total;
        
        System.out.println("Tutar : " + total);
    }
}
