package com.amitinside.generics.practice;

import java.util.List;

import com.google.common.collect.Lists;

public final class IndecentExposure {

	public static void main(final String[] args) {
		final List<Integer>[] studentMarksLists = IndecentExposure.studentMarksLists();
		final List<? extends Number>[] marksLists = studentMarksLists;
		marksLists[0] = Lists.newArrayList(20.23, 40.44, 50.44);
		final int num = studentMarksLists[0].get(0);
		System.out.println(num);
	}

	public static List<Integer>[] studentMarksLists() {
		final List<Integer>[] studentMarksLists = new List[2];

		final List<Integer> samMarks = Lists.newArrayList(40, 30, 48, 22, 98);
		final List<Integer> deanMarks = Lists.newArrayList(73, 98, 22, 73, 45);

		studentMarksLists[0] = samMarks;
		studentMarksLists[1] = deanMarks;

		return studentMarksLists;
	}

}
