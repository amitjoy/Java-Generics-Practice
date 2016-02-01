package com.amitinside.generics.practice;

public final class ArrayReification {

	public static void main(final String[] args) {
		final Integer[] integers = new Integer[5];
		final Number[] numbers = integers;
		numbers[0] = 1.1;
	}

}
