class Solution {
public:
    int reverse(int x) {
        int answer = 0;
        
        while(x != 0) {
            int digit = x % 10;
            x /= 10;
            
            if((answer < INT_MIN / 10) || (answer > INT_MAX / 10)) {
                return 0;
            }
            
            answer = (answer * 10) + digit;
        }
        
        return answer;
    }
};