class Solution {
public:
    long long minimumCost(int cost1, int cost2, int costBoth, int need1,
                          int need2) {
        if (need1 > need2) {
            std::swap(need1, need2);
            std::swap(cost1, cost2);
        }
        return std::min(
            std::min(1ll * need1 * cost1 + 1ll * need2 * cost2,
                     1ll * need1 * costBoth + 1ll * (need2 - need1) * cost2),
            1ll * need2 * costBoth);
    }
};