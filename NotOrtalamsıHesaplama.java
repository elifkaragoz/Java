
import java.util.Scanner;

public class Baslangic
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);
		int mat, fzk, kmy, trkc, trh, mzk;

		System.out.print("Matematik Notunuz: ");
		mat = inp.nextInt();

		System.out.print("Fizik Notunuz: ");
		fzk = inp.nextInt();

		System.out.print("Kimya Notunuz: ");
		kmy = inp.nextInt();

		System.out.print("Turkce Notunuz: ");
		trkc = inp.nextInt();

		System.out.print("Tarih Notunuz: ");
		trh = inp.nextInt();

		System.out.print("Muzik Notunuz: ");
		mzk = inp.nextInt();

		double sonuc = ((mat + fzk + kmy + trkc + trh + mzk) / 6.0);

		String info = sonuc >= 60 ? "Gectiniz" : "Kaldiniz";
		System.out.print(info);
	}
}