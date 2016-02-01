package com.amitinside.generics.practice;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.List;

import com.google.common.collect.Lists;

public final class ConvertCollectionToArray {

	public static void main(final String[] args) {
		final List<String> names = Lists.newArrayList("Sam", "Dean", "Lucifer");
		final String[] namesArray = new String[3];
		System.out.println(toArray1(names, namesArray));
		System.out.println(toArray2(names, String.class));
		System.out.println(names.toArray(namesArray));
	}

	public static <T> T[] toArray1(final Collection<T> collection, T[] array) {
		if (array.length < collection.size()) {
			array = (T[]) Array.newInstance(collection.getClass().getComponentType(), collection.size());
		}

		int i = 0;
		for (final T a : collection) {
			array[i++] = a;
		}

		if (i < array.length) {
			array[i] = null;
		}
		return array;
	}

	public static <T> T[] toArray2(final Collection<T> collection, final Class<T> clazz) {
		final T[] array = (T[]) Array.newInstance(clazz.getComponentType(), collection.size());

		int i = 0;
		for (final T a : collection) {
			array[i++] = a;
		}
		return array;
	}

}
