package com.amitinside.generics.practice;

import java.util.Arrays;
import java.util.List;

public final class UnchekedCast {

	public static void main(final String[] args) {
		final List objectss = Arrays.asList("a", "b", "c");
		final List<Object> objects = Arrays.asList("a", "b", "c");
		List<?> stringsInterim = null;
		List<String> strings = null;
		if (objects instanceof List<?>) {
			stringsInterim = (objects);
			if (stringsInterim instanceof List<?>) {
				strings = ((List<String>) stringsInterim);
			}
		}
		final List<String> stringss = ((List<String>) ((List<?>) objectss));
		System.out.println(strings);
		System.out.println(stringss);
	}

}
