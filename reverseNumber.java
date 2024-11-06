/*
Write main method in Solution class.
In the main method, write code to read a numeric digit(without any alphabets or special characters) using 
Scanner and print it in the reverse sequence as they appear in the input.
Consider below sample input and output:
Input:
12345
Output:
Reverse of the number is 54321
*/

import java.util.*;

class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = String.valueOf(n);
        StringBuilder s = new StringBuilder();
        s.append(str);
        s.reverse();
        System.out.print(s);
    }
}
