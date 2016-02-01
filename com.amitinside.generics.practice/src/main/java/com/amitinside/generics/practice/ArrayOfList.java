package com.amitinside.generics.practice;

import static java.util.Arrays.asList;

import java.util.List;

public final class ArrayOfList {

	public static void main(final String[] args) {
		final int SIZE = 10;
		final List<String> cars = asList("Audi", "BMW", "Kia", "Tata");
		final List<String> universities = asList("TU Munich", "RWTH Aachen", "Uni Stuttgart", "TU Kiel");
//		final List<String>[] arrayOfLists = new List<String>[] { cars, universities };
	}
}
