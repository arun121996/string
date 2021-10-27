package org.replaceall;

public class Replaceall {
	public static void main(String[] args) {
		String s1 ="Welcome";
		String s2 = s1.replaceAll("[aeiou]", "@");
		System.out.println(s2);
	}
}
