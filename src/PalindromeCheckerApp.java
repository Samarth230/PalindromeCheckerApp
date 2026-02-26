/* Use Case 1: Application Entry and Welcome Message
    Description:
    This class represents the entry point of the Palindrome Checker Management System
    */

import java.sql.Array;
import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args){
/* Use Case 8: Linked List based palindrome checker*/

    String input2 = "level";
    char[] Arr = input2.toCharArray();
    LinkedList<Character> linkedlist =  new LinkedList<>();
    boolean isPalindrome = true;

    for(char c: Arr){
        linkedlist.addFirst(c);
    }
    for(char c : Arr){
        if(c!= linkedlist.removeLast()){
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









