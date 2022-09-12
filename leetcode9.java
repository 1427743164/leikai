public class leetcode9 {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }   
        String xstr=x+"";
        int i=xstr.length()/2;       
        for (int j=0;j<i;j++) {
            char x1=xstr.charAt(j);
            char x2=xstr.charAt(xstr.length()-1-j);
            if (x1!=x2){
                return false;
            }
        }
        return true;
    }
}