package main.gen;

public class Functions {
public static void printSum (int a) {

for (

int i = 0;
i < 5; i ++) {
System.out.println(a);
}

}
public static void printStr (String str) {

for (

int j = 0;
j < 5; j ++) {
System.out.println(str);
}

}
public static int sumInFunc (int a,int b) {

int c = a + b;
return c;
}
public static int sum (int a,int b) {

int var = a + b;

int s = sumInFunc (var,b);
return s;
}
public static String difStr (String a,String b) {

String res = a + b;
return res;
}
}
