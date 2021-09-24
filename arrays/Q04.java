class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0, max = Integer.MIN_VALUE;;
        for(int i=0; i<accounts.length; i++){
            for(int j=0; j<accounts[i].length; j++){
                wealth += accounts[i][j];
            }
            if(wealth>max){
                max = wealth;
            }
            wealth = 0;
        }
        return max;
    }
}
