package org.identityhashcode;

public class IdentityHashCode {
	public static void main(String[] args) {
		String s1 ="Nisha";
		System.out.println(System.identityHashCode(s1));
		String s2="Nisha";
		System.out.println(System.identityHashCode(s2));
		
		String s3 = new String("Nisha");
		System.out.println(System.identityHashCode("Nisha"));
		String s4 = new String("Nisha");
		System.out.println(System.identityHashCode("Nisha"));
		
		String s5=new String("Nisha");
		System.out.println(System.identityHashCode("Nisha"));
		String s6=new String("Rengan");
		System.out.println(System.identityHashCode("Rengan"));
		String s7=new String("NishaRengan");
		System.out.println(System.identityHashCode("NishaRengan"));
		
		String s8="Nisha";
		System.out.println(System.identityHashCode(s8));
		String s9="Rengan";
		System.out.println(System.identityHashCode(s9));
		String s10="NishaRengan";
		System.out.println(System.identityHashCode(s10));
	}
}
