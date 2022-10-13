// Add interval to a list and Linearly iterate over the array
// If the last element in the list overlaps with the current interval, then merge the intervals by updating the last element of the list
// Else insert the interval into the list
// Time:O(NlogN)  Space:O(N)




 public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        int[] temp = intervals[0];
        res.add(temp);
        
        for(int[]  e : intervals) {
            if(e[0] <= temp[1]) 
                temp[1] = Math.max(temp[1], e[1]);
            else {
                temp = e;
                res.add(temp);
            }
        }
        
        
        return res.toArray(new int[res.size()][]);
    }