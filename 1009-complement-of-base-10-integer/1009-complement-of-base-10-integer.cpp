class Solution {
public:
    int bitwiseComplement(int n) {
        // Fix this hack
        if(n == 0) return 1;
        
        int copy = n;
        int mask = 0;
        
        while(copy != 0) {
            mask = (mask << 1) | 1;
            copy >>= 1;
        }
        
        return (~n & mask);
    }
};
