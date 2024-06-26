class Palindrome {
    public boolean isPalindrome(int x) {
        int rev=0,r,n=x;
        // Negative numbers and numbers ending with zero that are not zero are not palindromes
        if(n<0 || (n!=0 && n%10==0)){
            return false;
        }
        while(n!=0){
            r=n%10;
            rev=(rev*10)+r;
            n/=10;
        } 
        if(rev==x){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        Palindrome palindromeChecker = new Palindrome();
        int testNumber1 = 121; // Example test number
        int testNumber2 = -121; // Example test number for negative number
        System.out.println(testNumber1 + " is palindrome? " + palindromeChecker.isPalindrome(testNumber1));
        System.out.println(testNumber2 + " is palindrome? " + palindromeChecker.isPalindrome(testNumber2));
    }
}