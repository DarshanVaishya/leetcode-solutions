class Solution {
public:
    int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        
        while(n > 0) {
            int frac = n % 10;
            n /= 10;

            product *= frac;
            sum += frac;
        }
        
        return product - sum;
    }
};