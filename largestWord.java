/*
Find largest word from a given sentence.
if two string have same length then print the first one.

input : TCS is the best Company ever
output : Company
*/
import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int index = 0;
        int max = arr[index].length();
        
        for (int i=1; i<arr.length; i++){
            if (max<arr[i].length()){
                max = arr[i].length();
                index = i;
            }
        }
        System.out.print(arr[index]);
    }    
}
