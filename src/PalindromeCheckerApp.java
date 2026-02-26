/* Use Case 1: Application Entry and Welcome Message
    Description:
    This class represents the entry point of the Palindrome Checker Management System
    */

import java.sql.Array;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args){
/* Use Case 5: Stack Based*/

    String input2 = "radar";
    char[] arr = input2.toCharArray();
    Stack<Character> stack = new Stack<>();
    for(char c: arr){
        stack.push(c);
    }
    boolean isPalindrome= true;
    for(char c: arr){
        if(c!= stack.pop()){
            isPalindrome=false;
        }
    }
    if(isPalindrome){
        System.out.println("Its a Palindrome");
    }
    else{
        System.out.println("Its not a palindrome");
    }
    }}








