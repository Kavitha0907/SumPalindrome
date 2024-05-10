

//User function Template for Java
class Solution {
    static long isSumPalindrome(long n){
        for(int i=0;i<=5;i++){
            if(palindrome(n))
            return n;
            n=n+reverse(n);
        }
        return -1;
        // code here
    }
    static boolean palindrome(long n){
        if(n==reverse(n))
        return true;
    return false;
    }
    static long reverse(long n){
        long k=0;
        while(n>0){
            k=k*10+n%10;
            n/=10;
        }
        return k;
    }
}
