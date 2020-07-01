class QueueReconstruction {
    public int[][] reconstructQueue(int[][] people) {
        
        //Since for the tall guys the short ones are invisible so we will sort all the people in descending order of their height and if 2 people have same ht then ascending order of k
        Arrays.sort(people,new Comparator<int[]>(){
            
            public int compare(int a[], int b[]){
                
                return (a[0] == b[0]) ? a[1] - b[1] : b[0] - a[0]; 
            }
        });
        
        List<int[]> queue = new LinkedList<>();
        
        //We will insert the people after f places on list
        for(int[] p : people){
            
            queue.add(p[1],p);
        }
        
        int n = people.length;
        return queue.toArray(new int[n][2]);
        
    }
}
