import java.util.HashMap;
import java.util.Map;

// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
// assume just one solution,and not use the element twice
public class TwoSum {
    //tips: target-nums[i] whether in the map
    public int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length ;i++) {
            int complement = target -nums[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[]{i,map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int target = 7;
        TwoSum sum = new TwoSum();
        int[] result = sum.twoSum(nums,target);
        System.out.println(result);
    }
}
