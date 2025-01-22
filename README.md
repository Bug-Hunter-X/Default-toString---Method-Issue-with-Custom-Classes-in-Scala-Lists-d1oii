# Default toString() Method Issue with Custom Classes in Scala Lists

This repository demonstrates a common yet subtle issue in Scala related to the default `toString()` method of custom classes when working with lists or collections.  The problem arises when you create a list of objects of a custom class and then attempt to print its elements.  Instead of printing the desired field values, the default `toString()` representation, which is usually the object's memory address, is printed.

## Problem

The Scala code in `MyClass.scala` defines a simple class with an auxiliary constructor. When a list of `MyClass` objects is created and printed, the output is not the value of the `x` field, but rather the default object representation.

## Solution

The solution involves overriding the `toString()` method within the `MyClass` class to explicitly return the desired string representation, in this case, the value of the `x` field.
