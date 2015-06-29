package main.gen;

import org.w3c.dom.*;import static main.gen.Functions.*;


public class Output {
  public static void main(String[] args) {

int var = 2 + 3 * 5 + 3;

int a = 1;

int b = 2;

String str = "sss".replaceAll("sss","ddd");
printSum(var);
sum(a,b);

int s = sum (a,b);
System.out.println(s);
  }
}
