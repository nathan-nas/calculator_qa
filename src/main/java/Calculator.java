/*
    Source code is based on the material from Katalon:
    https://github.com/katalon-studio/testops-junit4
 */

//This is a simple Calculator class that performs basic arithmetic operations.
public class Calculator {

 // This method is named 'add'. It takes two integers as input (parameters) named 'a' and 'b'.
 // It returns the sum of 'a' and 'b'.
 public int add(int a, int b) {
     return a + b;
 }

 // This method is named 'subtract'. It takes two integers as input (parameters) named 'a' and 'b'.
 // It returns the result of 'a' subtracted by 'b'.
 public int subtract(int a, int b) {
     return a - b;
 }

 // This method is named 'multiply'. It takes two integers as input (parameters) named 'a' and 'b'.
 // It returns the product of 'a' and 'b'.
 public long multiply(int a, int b) {
     return a * b;
 }

 // This method is named 'divide'. It takes two integers as input (parameters) named 'a' and 'b'.
 // It returns the result of 'a' divided by 'b'.
 // If 'b' is zero, it throws an IllegalArgumentException. This is to prevent division by zero, which is undefined.
 public double divide(int a, int b) {
     if (b == 0) {
         throw new IllegalArgumentException("Divisor cannot be zero.");
     }
     return (double) a / (double) b;
 }
}
