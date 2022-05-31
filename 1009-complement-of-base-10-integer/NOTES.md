## Approach 1:

Make a copy of the original number, and keep right shifting it until it becomes 0. During this, keep adding one to a mask variable using

```cpp
// Do it this way instead of writing binary in integer
// Directly manipulating the bits
mask = (mask << 1) | 1;
```

Mask variable has the same length as the number's binary. Only difference is that it has 1 in all those places.

Once the loop finishes use AND gate (&) on original numbers compliment and the mask.

### Example
Number: 5
Binary: 000...0101
Mask:   000....0111

~Binary: 111...1010
Mask:     000...0111
result:     000...0010 (doing ~n & mask)

## Approach 2:
Make the same mask variable using approach 1. Now the trick is shown below

A number and its compilments sum always produces 111...111

For example,
Binary of 5:   101
Binary of ~5: 010
Sum:             111

So in this case we have the sum (mask variable) and the original number. To get the complement we can do 

```cpp
return mask - n;
```

## Edge case
This solutions won't work if given number is 0. In that case we have to handle that explicitly.
```cpp
if(n == 0) {
    return 1;
}
```
