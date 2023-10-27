package com.dimondproblem;

public interface FirstInterface {
	default void display() {
		System.out.println("Default method from FirstInterface");
	}
}
