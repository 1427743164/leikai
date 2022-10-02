public class leetcode1018 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int num = 0;
        int ori_length = nums.length;
        List<Boolean> result = new ArrayList<Boolean>();
        
        for(int i = 0;i < ori_length;i++){
            num = num << 1;
            num += nums[i];
            
            num %= 5;
            if(num == 0)
            {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;
    }
}
