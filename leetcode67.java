public class leetcode67{
    public String addBinary(String a,String b){
        
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        
        boolean dingZhen = false;
        StringBuilder xx = new StringBuilder();
        
        while (indexA >= 0 || indexB >= 0) {
            char ca = indexA >= 0 ? a.charAt(indexA) : '0';
            char cb = indexB >= 0 ? b.charAt(indexB) : '0';
            int n = ca + cb;
            
            switch (n) {
                case 98 -> {
                    xx.insert(0, dingZhen ? '1' : '0');
                    dingZhen = true;
                }
                case 97 -> xx.insert(0, dingZhen ? '0' : '1');
                default -> {
                    xx.insert(0, dingZhen ? '1' : '0');
                    dingZhen = false;
                }
            }

            indexA--;
            indexB--;
        }
        
        if (dingZhen)
            xx.insert(0, '1');
        return xx.toString();
        }
}