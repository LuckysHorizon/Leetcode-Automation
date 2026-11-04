class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;
        for(int num : gain)
        {
            altitude += num;
            maxAltitude = Math.max(maxAltitude,altitude);
        }
        return maxAltitude;
    }
}