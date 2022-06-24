public class NextGreaterElement496 {
    public static int[] func(int[] nums1, int[] nums2){
        int[] index = new int[nums1.length];
        int[] ans = new int[nums1.length];

        for(int i=0; i< nums1.length; i++){
            for(int j=0; j< nums2.length; j++){
                if(nums2[j] == nums1[i]){
                    index[i] = j;
                    break;
                }
            }
        }
        for(int i=0; i< nums1.length; i++){
            int start = index[i];
            if(start == nums2.length-1){
                ans[i] = -1;

            }
            for(int j=start; j<nums2.length; ){
                if(nums2[j] > nums1[i]){
                    ans[i] = nums2[j];
                    break;
                }
                else{
                    ans[i] = -1;
                }
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {3, 1, 5, 7, 9, 2, 6};
        int[] nums2 = new int[] {1, 2, 3, 5, 6, 7, 9, 11};

        int[] res = new int[nums1.length];
        res = func(nums1, nums2);
        for(int i=0; i< res.length; i++){
            System.out.print(res[i]+" ");
        }
    }

}
