package jr.leetcode.easy;

public class OneBuildArrayfromPermutation1920 {

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        OneBuildArrayfromPermutation1920 test = new OneBuildArrayfromPermutation1920();
        int[] input = new int[] {0,2,1,5,3,4};
        int[] result = test.buildArray(input);

        for(int number: result){
            System.out.println(number + " ");
        }
    }
}
