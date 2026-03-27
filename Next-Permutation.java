1class Solution {
2    public void nextPermutation(int[] nums) {
3        int i = nums.length-2;
4        int j = nums.length-1;
5        while(i>=0 && nums[i]>=nums[i+1]){
6            i--;
7        }
8         if(i>=0){
9        while(j>=0 && nums[j]<=nums[i]){
10            j--;
11        }
12        int temp = nums[i];
13        nums[i] = nums[j];
14nums[j] = temp;}
15        reverse(nums,i+1,nums.length-1);
16    }
17        public void reverse(int [] nums, int a, int b){
18
19while(a<b){
20int temp = nums[a];
21nums[a] = nums[b];
22nums[b] = temp;
23a++;
24b--;
25}
26        }
27    }
28