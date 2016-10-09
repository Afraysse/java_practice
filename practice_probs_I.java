/* Use a scanner class to parse int types. Read input from stdin
and specify the input stream as System.in */

import java.util.*;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

/* IF/ELSE CONDITIONALS

if n is odd, print Weird 

if n is even and in inclusive range, 2 - 5, print Not Weird 

if n is even and in inclusive range, 6 - 20, print Weird

if n is even and > 20, print Not Weird 

*/ 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*; 

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        if (n%2==1) {
            ans = "Weird";
        } else if (n%2 == 0 && n >= 2 && n <= 5) {
            ans = "Not Weird";
        } else if (n%2 == 0 && n >=6 && n <= 20) {
            ans = "Weird";
        } else if (n%2 == 0 && n > 20) {
            ans = "Not Weird";
        }
        System.out.println(ans);
    }


/*  JAVA STDIN & STDOUT II 

Read and print an integer, a double and a string from stdin. 
Input:
- first line: int 
- second line: double
- third line: string 

Output: 
- "String: " + string
- "Double " + double 
- "Int: " + int 
*/ 

import java.util.Scanner; 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String e = scan.nextLine(); // skip end of double since picked up double token
        String s = scan.nextLine(); // grab string sentence for printing

        System.out.println("String: " + e + s)
        System.out.println("Double: " + d)
        System.out.println("Int: " + i)
    }

/* JAVA OUTPUT FORMATTING 

Java's System.out.printf function prints formatted output.
Input: 
- Every line of input contains a String followed by int 
- Each string has max 10 alphabetic chars, each 0 > int < 999

Output: 
- 2 columns 
    - first with string; justified using 15 chars 
    - second with int; expressed in 3 digits
        - if original output < 3, pad with leading 0's
*/ 

import java.util.Scanner;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("===========================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();

            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("===========================");
    }


/* JAVA LOOPS 

Given an int, N, print the first 10 multiples. 
Each multiple N x i (where 1 <= i <= 10) should be printed on 
a new line, N x i = result 

Constraints: 2 <= N <= 20
*/ 

import java.io.*; 
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=1; i<=10;i++){
            int result = N*i;

            System.out.println(N + " x " + i + " = " + result)
        }
    }


/* JAVA LOOPS II 

Using integers a, b and n to create the following series:
(a+2^0 * b), (a + 2^0 * b + 2^1 * b),...,(a + 2^0 * b + 2^ 1 * b + ...+ 2^n-1 * b)

Given q queries in the form of a, b and n. For each q, print series
corresponding to the given a, b and n values as a single line of n space-seperated ints.

s0 = 0 + 1 * 2 = 2
s1 = 0 + 1 * 2 + 2 * 2 = 6
s2 = 0 + 1 * 2 + 2 * 2 + 4 * 2 = 14... 
*/ 

import java.util.*;
import java.io.*;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for (int i=0;i<t;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            runIt(a,b,n);
        }

        in.close();
    }

    public static void runIt(int a, int b, int n){
        int result = a;
        for (int i = 0; i<n;++i){
            result += b *((int)(Math.pow(2,i)));
            System.out.print(result+" ");
        }

        System.out.println();
    }

//OR 

public static void main(String[] args) {
    int x=0;
    Scanner in = new Scanner(System.in);
    int t=in.nextInt();
    for(int i=0;i<t;i++) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

    x=x+a;
    for(int e=0;e<n;e++) {
        x = x+(int)(Math.pow(2,e))*b;
        System.out.println(x+" ");
    }
        x=0;
        System.out.println();
    }
}

/* WORKING WITH PRIMITIVE DATA TYPES:
Char, boolean, byte, short, int, long, float and double 

Given an integer, determine which primitive data types are capable
of storing that input. 

Input: first line contains integer, T denoting # of test cases. 
- Each test case, T is comprised of a single line with an integer, n, which
can be arbitrarily large or small. 

Output: for each var n input and primitve datatype, must determine if the given
primitives are capable of storing it. If yes, print. 

*/
import java.util.*;
import java.io.*;
import java.math.*;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();

    for(int i=0;i<t;i++) {
        try {
            long x=sc.nextLong();
            System.out.println(x+" can be fitted in:");
            if(x>=-128 && x<=127)System.out.println("* byte");
            if(x>=-32768 && x<=32767)System.out.println("* short");
            if(x>=(Math.pow(-2,63)) && x<=(Math.pow(2,31)-1));
                System.out.println("* int");
            if(x>=(Math.pow(-2,63)) && x<=(Math.pow(-2,63)-1));
                System.out.println("* long");
        }
        catch(Exception e) {
            System.out.println(sc.next()+" can't be fitted anywhere.");
        }
    }
}















