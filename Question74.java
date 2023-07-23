class Solution {
    public int minPathSum(int[][] str) {
        int[][] arr = new int[str.length][str[0].length];
        arr[0][0] = str[0][0];

        for(int i = 0; i < str.length; i++) {
            for(int j = 0; j < str[0].length; j++) {
                if(i == 0 && j == 0) continue;
                 int right = Integer.MAX_VALUE;
                 if(j-1 >= 0) right = arr[i][j-1] + str[i][j];
                 int down = Integer.MAX_VALUE;
                 if(i-1 >= 0) down = arr[i-1][j] + str[i][j];
                 arr[i][j] = Math.min(right, down);
            }
        }
        return arr[arr.length - 1][arr[0].length - 1];
    }
}
