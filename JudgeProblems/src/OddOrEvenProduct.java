import java.util.Scanner;

public class OddOrEvenProduct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		long oddsProduct = 1, evensProduct = 1;

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if(i % 2 == 0) oddsProduct *= arr[i];
			else evensProduct *= arr[i];
		}

		if (oddsProduct == evensProduct) {
			System.out.println("yes " + oddsProduct);
		} else {
			System.out.println("no " + oddsProduct + " " + evensProduct);
		}
	}

}
