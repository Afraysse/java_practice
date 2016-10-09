/* Use a scanner class to parse int types. Read input from stdin
and specify the input stream as System.in */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
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

public class Solution {

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

public class Solution {

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
}
















