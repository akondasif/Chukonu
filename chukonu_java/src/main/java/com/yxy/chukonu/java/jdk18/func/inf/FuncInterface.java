package com.yxy.chukonu.java.jdk18.func.inf;

@FunctionalInterface //only one abstract method could be allowed to define.
public interface FuncInterface<F, T> {
	 T convert(F from);
}
