package Arrays;

/**
 * 238. Product of Array Except Self
 */
public class ProductArray {


    public static void main(String[] args) {
       int[] nums = {1,2,3,4,5};
       int[] product = productExceptSelf(nums);
       for(int a:product){
           System.out.println(a);
       }
    }

    /**
     * Naive solution
     * @param nums
     * @return
     * O(n) - time complexity
     * O(2n) - space complexity
     */

    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int leftProduct =1;
        int rightProduct =1;
        output[0]=leftProduct;
        for(int i =1;i<nums.length;i++){
            leftProduct *=nums[i-1];
            output[i]=leftProduct;
        }
        output[nums.length-1] *= rightProduct;
        for(int i= nums.length-2;i>=0;i--){
            rightProduct = rightProduct*nums[i+1];
            output[i]=rightProduct*output[i];
        }

        return output;
    }

    public static int[] productExceptSelf1(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] output = new int[nums.length];
        int leftProduct =1;
        int rightProduct =1;
        for(int i =0;i<nums.length;i++){
            if(i-1<0){
                left[i]=leftProduct;
            }
            else{
                leftProduct *=nums[i-1];
                left[i]=leftProduct;
            }
        }

        for(int i=nums.length-1;i>=0;i--){
            if(i+1 == nums.length){
                right[i]=rightProduct;
            }
            else{
                rightProduct *=nums[i+1];
                right[i]=rightProduct;
            }
        }

        for(int i =0; i<nums.length;i++){
            output[i]=left[i]*right[i];
        }
        return output;
    }
}
