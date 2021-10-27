package org.lowerupper;

public class LowerUpper {
	public static void main(String[] args) {
		String s1 ="NISHANTHI";
		String a=s1.toLowerCase();
		System.out.println(a);
		
		String s2 = "nishanthi";
		String b=s2.toUpperCase();
		System.out.println(b);
		
		String s3 ="WelcomE";
		String c=s3.replace("[97 to 122]", "[65 to 90]");
		System.out.println(c);
	}
}
