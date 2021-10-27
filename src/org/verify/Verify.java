package org.verify;

public class Verify {
	public static void main(String[] args) {
		String s1 ="Welcome to class java";
		boolean a=s1.startsWith("Welcome");
		System.out.println(a);
		
		String s2="Hai i am nish";
		Boolean b =s2.startsWith("welcome");
		System.out.println(b);
		
		String s3 ="Welcome to java class";
		Boolean c = s3.endsWith("class");
		System.out.println(c);
		
		String s4 ="Welcome to java class";
		Boolean d =s4.endsWith("java");
		System.out.println(d);
		
		String s5 ="Welcome to java class";
		Boolean e =s5.isEmpty();
		System.out.println(e);
		
		String s6 = " ";
		Boolean f =s6.isEmpty();
		System.out.println(f);
	}
}
