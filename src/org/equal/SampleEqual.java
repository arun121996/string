package org.equal;

public class SampleEqual {
	public static void main(String[] args) {
		String s1 ="java";
		String s2 = "java";
		Boolean a= s1.equals(s2);
		System.out.println(a);
		
		String s3="Greens Technology";
		String s4="GreensTechnology.";
		Boolean b =s3.equals(s4);
		System.out.println(b);
		
		String s5="Java";
		String s6="java";
		Boolean c =s5.equals(s6);
		System.out.println(c);
		
		String s7="Java";
		String s8="java";
		Boolean d =s7.equalsIgnoreCase(s8);
		System.out.println(d);
		
		String s9 ="Nisha";
		String s10="nisha";
		Boolean e =s9.equalsIgnoreCase(s10);
		System.out.println(e);
		
	}
}
