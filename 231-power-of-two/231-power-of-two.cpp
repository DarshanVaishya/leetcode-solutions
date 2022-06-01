class Solution {
public:
    bool isPowerOfTwo(int n) {
        int num = 1;
        while(num < n && num < (INT32_MAX / 2)) {
            if(num == n) break;
            num *= 2;
        }
        return num == n;
    }
};