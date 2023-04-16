package com.company.advancedCoding.lengthword;

@FunctionalInterface
public interface LengthFunction<T> {
    int getLength(T element);
}
