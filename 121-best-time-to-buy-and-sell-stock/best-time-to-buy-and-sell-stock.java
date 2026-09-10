class Solution {
    public int maxProfit(int[] prices) {
        int mp=0;
            int min=prices[0];
            for(int j=1;j<prices.length;j++){
                
                if(prices[j]<min){
                    min=prices[j];
                }

                int prof=prices[j]-min;

            if(prof>mp){
                mp=prof;
            }
    }

        return mp;
    }
}