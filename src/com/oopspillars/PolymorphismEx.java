package com.oopspillars;

public class PolymorphismEx {
	
		void primitivePreference(int a) {
			System.out.println("Invoked the method of Ineger");
		}
		void primitivePreference(float a) {
			System.out.println("Invoked the method of float");
		}
		void primitivePreference(double a) {
			System.out.println("Invoked the method of double");
		}
		void primitivePreference(boolean a) {
			System.out.println("Invoked the method of boolean");
		}
		void primitivePreference(String a) {
			System.out.println("Invoked the method of String");
		}
		void primitivePreference(char a) {
			System.out.println("Invoked the method of char");
		}
		void primitivePreference(long a) {
			System.out.println("Invoked the method of long");
		}
		void primitivePreference(byte a) {
			System.out.println("Invoked the method of byte");
		}

	public static void main(String[] args) {
		PolymorphismEx poly = new PolymorphismEx();
		poly.primitivePreference(1);
		poly.primitivePreference(false);
		poly.primitivePreference(1.0f);
	}

}
