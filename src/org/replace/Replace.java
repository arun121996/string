package org.replace;

public class Replace {
	public static void main(String[] args) {
		String s1 ="Welcome to class java";
		String a=s1.replace("java", "sql");
		System.out.println(a);
		
		String s2="Greens Adayar";
		String b =s2.replace("Adayar", "omr");
		System.out.println(b);
		
		String s3 ="Welcome to java class";
		String c =s3.replace(" ", "#");
		System.out.println(c);
		
		String s4 = "Nishakerala24@gmail.com";
		String d=s4.replace("gmail", "yhoo");
		System.out.println(d);
		
		String s5="5-35-2a,vengateshnivas,Aruppukottai,pincode-626101";
		String e =s5.replace("pincode-626101"," ");
		System.out.println(e);
	}
}
