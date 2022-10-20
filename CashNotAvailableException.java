package Teleapps;

import java.util.Scanner;

public class CashNotAvailableException extends Exception {
	public static void cash() throws CashNotAvailableException {
		int atmAmount = 5000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount");
		int userAmount = sc.nextInt();
		if (userAmount > atmAmount) {
			throw new CashNotAvailableException();
		} else if (userAmount <= atmAmount) {
			System.out.println("Collect your cash");
		}
	}

}