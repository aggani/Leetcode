public class MaximumSubarray53 {
    public static int func(int[] nums){
        int currentSeq = nums[0];
        int overallBest = nums[0];
        for(int i=1; i< nums.length; i++){
            if(currentSeq + nums[i] > nums[i]){
                currentSeq += nums[i];
                if(currentSeq > overallBest){
                    overallBest = currentSeq;
                }
            }
            else{
                currentSeq = nums[i];
                if(currentSeq > overallBest){
                    overallBest = currentSeq;
                }
            }
        }
        return overallBest;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {4, 3, -2, 6, -14, 7, -1, 4, 5, 7, -10, 2, 9, -10, -5, -9, 6, 1};
        System.out.println(func(nums));
    }
}
