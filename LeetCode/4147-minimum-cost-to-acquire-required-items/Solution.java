class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long both = Math.min(need1,need2);
        long case1 = Math.min(costBoth,cost1 + cost2);
        long case2 = Math.min(costBoth,cost1);
        long case3 = Math.min(costBoth, cost2);
        return both * case1 + (need1 - both) * case2 + (need2 - both) * case3;
    }
}