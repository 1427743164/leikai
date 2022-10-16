public class leetcode806 {
    public int[] numberOfLines(int[] widths, String s) {
        int rows = 1;
        int cnts = 0;
        char[] sArr = s.toCharArray();
        int len = sArr.length;
        for(int i=0; i<len; i++){
            int cnt = widths[sArr[i]-'a'];
            if(cnts + cnt <= 100){
                cnts += cnt;
            }else{
                rows++;
                cnts = cnt;
            }
        }
        return new int[] {rows, cnts};
    }
}

