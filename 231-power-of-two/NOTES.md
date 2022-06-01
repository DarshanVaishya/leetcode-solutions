Great solution taken from [discussion section](https://leetcode.com/problems/power-of-two/discuss/63966/4-different-ways-to-solve-Iterative-Recursive-Bit-operation-Math)
## Bit operation approach

If n is the power of two:

```
n = 2 ^ 0 = 1 = 0b0000...00000001, and (n - 1) = 0 = 0b0000...0000.
n = 2 ^ 1 = 2 = 0b0000...00000010, and (n - 1) = 1 = 0b0000...0001.
n = 2 ^ 2 = 4 = 0b0000...00000100, and (n - 1) = 3 = 0b0000...0011.
n = 2 ^ 3 = 8 = 0b0000...00001000, and (n - 1) = 7 = 0b0000...0111.
```

we have n & (n-1) == 0b0000...0000 == 0

Otherwise, n & (n-1) != 0.

For example, n =14 = 0b0000...1110, and (n - 1) = 13 = 0b0000...1101.

```cpp
return n > 0 && ((n & (n-1)) == 0);
```

Time complexity = O(1)

### My explanation

The trick is that when a number can be expressed in 2^k then the AND gate of n and n-1 results in 0.
So in this solution we just check if number is above 0 and n & n - 1

