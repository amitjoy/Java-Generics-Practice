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

import java.util.Collection;
import java.util.Comparator;

public final class ComparatorGenerics {

	public static <T extends Comparable<? super T>> T max(final Collection<? extends T> collection) {
		return max(collection, naturalOrder());
	}

	public static <T> T max(final Collection<? extends T> collection, final Comparator<T> comparator) {
		T value = collection.iterator().next();
		for (final T t : collection) {
			if (comparator.compare(value, t) < 0) {
				value = t;
			}
		}
		return value;
	}

	public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
		return (n1, n2) -> n1.compareTo(n2);
	}

	public static <T extends Comparator<? super T>> Comparator<T> reverseOrder() {
		return (n1, n2) -> n1.compare(n2, n1);
	}

	public static <T extends Comparable<? super T>> Comparator<T> reverseOrder2() {
		return (n1, n2) -> n2.compareTo(n1);
	}

}
