package org.presentornot;

public class PresentOrNot {
	public static void main(String[] args) {
		String s1 ="velmurugank451@gmail.com";
		Boolean a=s1.contains(s1);
		System.out.println(a);
		
		String s2="5-35-2a,vengateshnivas,Aruppukottai,pincode";
		Boolean b = s2.contains("pincode:642133");
		System.out.println(b);
		
		String s3="Nishakerala24@gmail.com";
		Boolean c =s3.contains(s3);
		System.out.println(c);
		
		String s4 ="90954a6o78";
		Boolean d=s4.contains("9095496078");
		System.out.println(d);
	}
}
