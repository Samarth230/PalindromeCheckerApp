/* Use Case 1: Application Entry and Welcome Message
    Description:
    This class represents the entry point of the Palindrome Checker Management System
    */

import java.sql.Array;

public class PalindromeCheckerApp {
    public static void main(String[] args){
/* Use Case 4: Character Array*/

    String input2 = "radar";
    char[] Arr= input2.toCharArray();
    boolean isPalindrome = true;
    int start = 0;
    int end = Arr.length-1;
    if(start<end){
        if(Arr[start]!=Arr[end]){
        isPalindrome=false;}
        start++;
        end--;
    }
    if(isPalindrome){
        System.out.println("its a palindrome");
    }
    else {
        System.out.println("Its not a palindrome");
    }
    }}




