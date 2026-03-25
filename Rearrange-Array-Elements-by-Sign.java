1class Solution {
2    public int[] rearrangeArray(int[] arr) {
3        int s [] = new int[arr.length];
4        int a = 0;
5        int b = 1;
6        int n = arr.length;
7        for(int i = 0;i<n;i++){
8            if(arr[i]>0){
9                s[a] = arr[i];
10                a+=2;
11            }
12            else{
13                s[b] = arr[i];
14                b+=2;
15            }
16        }
17        return s;
18    }
19}