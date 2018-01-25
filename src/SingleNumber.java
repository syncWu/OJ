//Given an array of integers, every element appears twice except for one. Find that single one.
public class SingleNumber {
    public int singleNumber(int[] nums){
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {2,2,3,3,4,4,5,5,1};
        System.out.println(singleNumber.singleNumber(nums));
    }
}
