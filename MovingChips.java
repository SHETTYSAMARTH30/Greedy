class MovingChips {
    public int minCostToMoveChips(int[] position) {
        
        //Since cost of jumping to position[i]+2 and position[i]-2 is 0. We will move all the coins which are at even position to position 0 and odd position to position 1.
        //Then whichever position among 0 or 1 has less coin will be moved to neighboring position with cost=1
        
        //Counts number of coins at even positions
        int evenCnt = 0;
        
        //Counts number of coins at odd positions
        int oddCnt = 0;
        
        for(int n : position){
            
            if(n % 2 == 0)
                evenCnt++;
            
            else
                oddCnt++;
        }
        
        return Math.min(evenCnt, oddCnt);
    }
}
