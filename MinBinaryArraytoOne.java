//19th march 2025
//3191.Minimum operation to make binary array elements equal to one 
class Solution {
  public int minOperations(int[] nums) {
    final int n = nums.length;
    int ans = 0;

    for (int i = 0; i + 2 < n; ++i)
      if (nums[i] == 0) {
        nums[i + 1] ^= 1;
        nums[i + 2] ^= 1;
        ++ans;
      }

    return nums[n - 1] == 0 || nums[n - 2] == 0 ? -1 : ans;
  }
}
