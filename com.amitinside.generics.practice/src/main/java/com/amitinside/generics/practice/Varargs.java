package com.amitinside.generics.practice;

import java.util.Arrays;
import java.util.List;

public final class Varargs {

	public static void main(final String[] args) {
		final List<Integer> list1 = Arrays.asList(10, 20, 30);
		final List<Integer> list2 = Arrays.asList(50, 60, 70);
		final List<List<Integer>> combined = Arrays.asList(list1, list2);
		System.out.println(combined);
	}

}
