/* Use Case 1: Application Entry and Welcome Message
    Description:
    This class represents the entry point of the Palindrome Checker Management System
    */

import java.sql.Array;
import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args){
/* Use Case 5: Stack Based*/

    String input2 = "civic";
    char[] Arr = input2.toCharArray();
    Queue<Character> queue =  new LinkedList<>();
    Stack<Character> stack = new Stack<>();
    boolean isPalindrome = true;

    for(char c: Arr){
        stack.push(c);
        queue.add(c);
    }
    for(char c : Arr){
        if(queue.remove()!=stack.pop()){
            isPalindrome = false;
            break;
        }
    }
    if(isPalindrome){
        System.out.println("Its a palindrome");
    }
    else{
        System.out.println("Its not a palindrome");
    }}}









