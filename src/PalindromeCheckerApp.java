/* Use Case 1: Application Entry and Welcome Message
    Description:
    This class represents the entry point of the Palindrome Checker Management System
    */

public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version 1.0");
        System.out.println("System initialised Successfully");

        /* Use Case 2: Hard Coded Palindrome Validation System
         */

    String input = "madam";
    boolean palindrome = true;
    char Arr[]=input.toLowerCase().toCharArray();
    for(int i=0;i<input.length()/2;i++){
       if(input.charAt(i)!=input.charAt(input.length()-1-i)){
           palindrome = false;
           break;
        }
    }
    if(palindrome)
        System.out.println("The given String is a palindrome");
    else
        System.out.println("The given String is not a palindrome");


    /*Use Case 3: Check whether a string is a palindrome by reversing it.     */
    }

}




