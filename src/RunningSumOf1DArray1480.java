public class RunningSumOf1DArray1480 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 2, 10, 1};
        int[] res = new int[nums.length];
        res = func(nums);
        for (int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] func(int[] nums){
        int[] newArr = new int[nums.length];
        newArr[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
            newArr[i] = newArr[i-1] + nums[i];
        }
        return newArr;
    }
}
