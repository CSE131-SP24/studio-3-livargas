package studio3;

import java.util.Scanner;

public class SieveofEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] prime= {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for(int i=2;i<prime.length;i++) {
			for(int a=i;a<prime.length;a++) {
				int ruleout=i*a;
				ruleout = 0;
				System.out.println(ruleout);
				System.out.println(prime[a]);
			}

		}

	}
}