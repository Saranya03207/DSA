class Solution {
    class Jobs{
        int st;
        int end;
        int pay;
        Jobs(int st,int end,int pay){
            this.st=st;
            this.end=end;
            this.pay=pay;
        }
        
    }
    class Pair{
        int end;
        int pay;
        Pair(int end,int pay){
            this.end=end;
            this.pay=pay;
        }
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        ArrayList<Jobs> work=new ArrayList<>();
        for(int i=0;i<startTime.length;i++){
            work.add(new Jobs(startTime[i],endTime[i],profit[i]));
        }
        Collections.sort(work,(a,b)->a.st-b.st);

        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b) -> a.end - b.end);
        int maxProfit=0;
        for(int i=0;i<startTime.length;i++){

            while(!pq.isEmpty() && pq.peek().end<=work.get(i).st){
                maxProfit=Math.max(maxProfit,pq.poll().pay);
            }

            pq.offer(new Pair(work.get(i).end,maxProfit+work.get(i).pay));
            }
        
        while(!pq.isEmpty()){
            maxProfit=Math.max(maxProfit,pq.poll().pay);
        }
        return maxProfit;
    }
}