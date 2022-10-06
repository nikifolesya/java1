public class Palindrome {
    public static void main(String[] args) { 
        for (int i = 0; i < args.length; i++) {
            String s = args[i];

           
            if (isPalindrome(s)) {
                System.out.println(s + " это палиндром");
            }
            //  else {
             //   System.out.println(s + " это не палиндром");
            //} 
        }
    }
    public static String reverseString(String s) {
        String str = "";
        for (int index = 0; index < s.length(); index++) {
            str += s.charAt(s.length() - 1 - index);
                }
        
        return str;
    }
    public static boolean isPalindrome(String s) {
        if (s.equals(reverseString(s))) {
            return true;
        }
        return false;
    }
    }
    
    