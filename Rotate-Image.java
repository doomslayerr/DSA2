1class Solution {
2    public void rotate(int[][] matrix) {
3     int n = matrix.length;
4     for(int i = 0; i<n-1;i++){
5        for(int j = i+1;j<n;j++){
6            int temp = matrix[i][j];
7            matrix[i][j] = matrix[j][i];
8            matrix[j][i] = temp;
9
10        }
11
12     }
13
14     for(int i = 0;i<n;i++){
15        for(int j = 0;j<n/2;j++){
16int temp =            matrix[i][j];
17matrix[i][j] = matrix[i][n-j-1];
18matrix[i][n-j-1] = temp;
19        
20        
21        }
22     }
23    }
24}