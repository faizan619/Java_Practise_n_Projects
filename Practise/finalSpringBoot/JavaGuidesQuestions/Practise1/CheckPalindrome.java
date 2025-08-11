public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println("Check palindrome");
        String text = "madamj";
        int size = text.length();
        Boolean isPalindrome = true;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i) != text.charAt(size-i-1)){
                isPalindrome = false;
            }
        }
        if(isPalindrome){ System.out.println("It is a Palindrome");}
        else{System.out.println("It is not a Palindrome");}
    }
}
