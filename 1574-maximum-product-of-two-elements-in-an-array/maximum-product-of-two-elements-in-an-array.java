import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return ((nums[nums.length-1]-1)*(nums[nums.length-2]-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.maxProduct(arr);
        System.out.println(result);
    }
}

