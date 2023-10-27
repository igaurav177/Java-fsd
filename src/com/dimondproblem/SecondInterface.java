package com.dimondproblem;

public interface SecondInterface {
	default void display() {
        System.out.println("Default method from SecondInterface");
    }

}
