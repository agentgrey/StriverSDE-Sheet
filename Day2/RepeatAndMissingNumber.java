// Mathematical Approach
// Time:O(N)  Space:O(1)




public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
       long len = A.size();

        long S = (len * (len+1) ) /2;
        long P = (len * (len +1) *(2*len +1) )/6;
        long missingNumber=0, repeating=0;
        
        for(int i=0;i<A.size(); i++){
            S -= (long)A.get(i);
            P -= (long)A.get(i)*(long)A.get(i);
        }
        
        missingNumber = (S + P/S)/2;

        repeating = missingNumber - S;

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add((int)repeating);
        ans.add((int)missingNumber);
        
        return ans;
    }





// XOR
// Calculate xor of all elements
// it will result as x^y, that means the index bit is only set at x or y
// Time:O(N)  Space:O(1)
