class Solution {
    private int digSumSq(int n){
        int sum = 0;
        while(n>0){
            int ld=n%10;
            sum+=ld*ld;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        // Keep looping as long as n is not 1 and we haven't seen n before
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = digSumSq(n);
        }

        // If n ended up as 1, it's happy! Otherwise, we hit a cycle.
        return n == 1;
    }
}
