class Solution {
    public int maxLength(int[] nums) 
    {
        int ans = 1;
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            int prod = 1;
            int g = nums[i];
            int l = nums[i];

            for(int j = i; j < n; j++)
            {
                prod *= nums[j];
                g = gcd(g, nums[j]);
                l = lcm(l, nums[j]);

                if(prod == g * l)
                {
                    ans = Math.max(ans,j - i + 1);
                }
            }
        }
        return ans;
    }
    public int gcd(int a, int b)
    {
        return b == 0 ? a : gcd(b , a % b);
    }
    public int lcm(int a, int b)
    {
        return (a / gcd(a,b)) * b;
    }
}