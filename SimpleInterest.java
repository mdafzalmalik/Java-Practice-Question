package basic;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int t = sc.nextInt();
		int r = sc.nextInt();
		int si = (p*r*t)/100;  // formula of SI ---> (SI = P X R X T) / 100
		System.out.println(si);


	}

}
