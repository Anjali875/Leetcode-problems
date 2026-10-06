class Solution {
    public boolean isPalindrome(int x) {
        boolean isPal=true;
        String s = String.valueOf(x);
        int n=s.length();
        int left=0;
        int right=n-1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return isPal;
    }
}