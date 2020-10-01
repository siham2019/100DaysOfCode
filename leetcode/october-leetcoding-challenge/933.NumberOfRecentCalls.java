class RecentCounter {
    
    private java.util.LinkedList<Integer> pings;

    public RecentCounter() {
        this.pings = new java.util.LinkedList<>();
    }
    
    public int ping(int t) {
        pings.addLast(t);
        purge(t);
        return pings.size();
    }
    //Sliding window
    private void purge(int t){
        while(pings.getFirst()<(t-3000)){
            pings.removeFirst();
        }
    }
}

//https://leetcode.com/problems/number-of-recent-calls/