class Solution {
    public int minAddToMakeValid(String s) {
        int n= s.length();
        int open=0;
        int num=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                open++;
            }
            if(s.charAt(i)==')'){
                if(open>0){
                    open--;
                }else{
                    num++;
                }
            }
        }
        return num+open;
    }
}