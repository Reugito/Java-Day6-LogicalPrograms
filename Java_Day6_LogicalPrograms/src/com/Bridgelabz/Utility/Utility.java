package com.Bridgelabz.Utility;

import java.util.Random;
import java.util.Scanner;

public class Utility {
	Scanner scanner;
	
	public Utility() {
		scanner = new Scanner(System.in);
	}

	public int getIntValue() {
		return scanner.nextInt();
	}
	/* method to getFibonacci series */
	public void getFibonacci(int n) {
		int num1 = 0, num2 = 1;
	    int cnt = 0;
	    while (cnt < n) {
	    	System.out.print(num1 + " ");
	        int num3 = num2 + num1;
	        num1 = num2;
	        num2 = num3;
	        cnt = cnt + 1;
	   }
	}
	/* method to check perfect number or not*/

	public void checkPerfectNum(int n) {
		int sum = 0;
		for(int i=1; i<=n/2; i++) {
			if(n % i == 0) {
				 sum += i;	
			}
		}
		if(n == sum)
			System.out.println(n+" is perfect number");
		else
			System.out.println(n+" is no perfect number");
		
	}
	/* to check number is prime or not */

	public void checkPrimeNum(int n) {
		boolean flag = true;
		if(n != 0 && n != 1) {
			
			for(int i=2; i<=n/2; i++) {
				if(n % i == 0)
					flag = false;
			}
			if(flag)
				System.out.println(n+" is prime number");
			else
				System.out.println(n+" is not prime number");
		}
		else
			System.out.println(n+" is not prime number");
	}
	/* method for reverse number */

	public void getReverseNum(int n) {
		int digit = 0, reverse = 0, temp = n;
		while(temp > 0) {
			digit = temp % 10;
			reverse = reverse*10+digit;
			temp /= 10;
		}
		System.out.println("Reverse of "+n+" = "+reverse);
		
	}
	/* method to get random coupons*/
	
	public static void getCoupons(int noOfcoupns, int sizeOfCoupon) {
		int cnt = 0;
		String str1 = "";
		String coupns = "";
		while(cnt != noOfcoupns) {
			str1 = generateCoupons(sizeOfCoupon);
			if(!coupns.contains(str1)) {
				coupns += str1;
				cnt++;
				System.out.println("coupon"+cnt+" =  "+str1);
			}
		}
		
	}
	/* method to generate random coupons*/
	
	public static String generateCoupons(int sizeOfCoupon) {
		String str = "";
		Random random = new Random();
			for(int i=0; i<sizeOfCoupon; i++) {
				int num = random.nextInt(10);
				str += ""+num;
			}
		return str;
	}
	/* method to get  Elaps time */
	
	public void getElapsTime() {
		int choice=0;
	    double start=0, stop=0;
        do {
            System.out.println("1. Start");
            System.out.println("2. Stop");
            choice = getIntValue();
            switch(choice) {
       			case 1:
       				start = System.currentTimeMillis();
       				System.out.println("You have started the stopwatch please select stop now");
       				break;
       			case 2:
       				stop = System.currentTimeMillis();
       				break; 
            }
       }while(choice != 2);
       double elaps = ((stop - start)/1000)%60;
       System.out.println("Elaps time = "+elaps+" sec");	
	}
}
