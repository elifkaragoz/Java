/*
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Urunler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
*/

import java.util.Scanner;

public class ManavKasa 
{
    public static void main(String[] args)
    {
        double armut = 2.14, elma = 3.67, domat = 1.11, muz = 0.95 , patl = 5, total;
        int akg, ekg, dkg, mkg, pkg;

        Scanner input = new Scanner(System.in);
        System.out.println("Almak istediginiz urunu/urunleri kg cinsinden girin: ");
        System.out.print("Armut: ");
        akg = input.nextInt();
        System.out.print("Elma: ");
        ekg = input.nextInt();
        System.out.print("Domates: ");
        dkg = input.nextInt();
        System.out.print("Muz: ");
        mkg = input.nextInt();
        System.out.print("Patlican: ");
        pkg = input.nextInt();

        total = (armut * akg) + (elma * ekg) + (domat * dkg) + (muz * mkg) + (patl * pkg);
        System.out.print("Toplam Tutar: " + total);
    }
}
