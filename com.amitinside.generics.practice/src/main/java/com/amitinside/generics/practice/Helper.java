package com.amitinside.generics.practice;

import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class Helper {

	public static void main(final String[] args) {
		final List<String> strings = asList("a", "b", "c");
		final String[] array = toArray(strings);
		System.out.println(array);
		System.out.println(Arrays.toString(toArray3(strings)));
	}

	public static <T> T[] toArray(final Collection<T> collection) {
		final T[] arr = (T[]) new Object[collection.size()];
		int i = 0;
		for (final T val : collection) {
			arr[i++] = val;
		}
		return arr;
	}

	public static <T> T[] toArray2(final Collection<T> collection) {
		// final T[] arr = new T[collection.size()];
		// int i = 0;
		// for (final T val : collection) {
		// arr[i++] = val;
		// }
		// return arr;
		return null;
	}

	public static Object[] toArray3(final Collection collection) {
		final Object[] arr = new Object[collection.size()];
		int i = 0;
		for (final Object val : collection) {
			arr[i++] = val;
		}
		return arr;
	}

}
