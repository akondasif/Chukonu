package com.yxy.chukonu.java.jdk18.func.predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<String> predicate = (s) -> s.length() > 0;
		predicate.test("foo");              // true
		predicate.negate().test("foo");     // false

		Predicate<Boolean> nonNull = Objects::nonNull;
		Predicate<Boolean> isNull = Objects::isNull;

		Predicate<String> isEmpty = String::isEmpty;
		Predicate<String> isNotEmpty = isEmpty.negate();

	}

}
