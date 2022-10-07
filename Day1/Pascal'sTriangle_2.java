// Reccursive Solution


public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows==0) return res;
        pascal(numRows, res);
        return res;
        
    }
    public void pascal(int n, List<List<Integer>> list) {
        if(n==1) {
            list.add(Arrays.asList(1));
        } 
        else {
            
            pascal(n-1, list);
            List<Integer> previousList = list.get(n -2);
            List<Integer> thisList = new ArrayList<>();
            
            for (int i = 0; i < previousList.size(); i++) {
                if (i == 0) thisList.add(1);
                if (i > 0) thisList.add(previousList.get(i) + previousList.get(i-1));
                if (i == previousList.size() -1) thisList.add(1);
            }
            
            list.add(thisList);
        }
        
        
    }