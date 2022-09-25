class Solution {
    final static int START = 0;
    final static int END   = 1;
    
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if(n <= 1) return intervals;
        
        int[][] sortedIntervals = intervals.clone();
        Arrays.sort(sortedIntervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        int[] storedInterval = sortedIntervals[0];
        List<int[]> res = new ArrayList<>();
        
        for(int i = 1; i < n; i++) {
            int[] currentInterval = sortedIntervals[i];
            
            if(storedInterval[END] >= currentInterval[START]) {
                storedInterval[END] = Math.max(storedInterval[END], currentInterval[END]);
            } else {
                res.add(storedInterval);
                storedInterval = currentInterval;
            }
            
            if(i == n - 1) {
                res.add(storedInterval);
            }
        }
        
        return res.toArray(new int[res.size()][]);
    }
}