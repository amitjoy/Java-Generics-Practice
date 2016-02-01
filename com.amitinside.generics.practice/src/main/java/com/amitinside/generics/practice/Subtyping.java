/*******************************************************************************
 * Copyright 2016 Amit Kumar Mondal
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.amitinside.generics.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Subtyping {

	private static <T> void copy(final List<? super T> destination, final List<? extends T> source) {
		for (int i = 0; i < source.size(); i++) {
			destination.set(i, source.get(i));
		}
	}

	public static void main(final String[] args) {
		final List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		final List<Number> numbers = new ArrayList<Number>();
		numbers.add(3.12);
		numbers.add(2);
		new ArrayList<>();

		final List<Object> objss = Arrays.<Object> asList(2, 3.14, "four");
		final List<Integer> integers = Arrays.<Integer> asList(5, 6);
		Subtyping.<Object> copy(objss, integers);
		Collections.<Number> copy(objss, integers);
		Collections.<Integer> copy(objss, integers);
		Collections.copy(objss, integers);

		// The Type of the number is null now as the compiler
		// doesn't know about the actual type of the ArrayList
	}

}
