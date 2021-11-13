### Problem:

#### Given a non-empty array of integers ```nums```, every element appears twice except for one. Find that single one.

#### You must implement a solution with a linear runtime complexity and use only constant extra space.

- Example 1:
  - Input: nums = [2, 2, 1]
  - Output: 1

- Example 2:
  - Input: nums = [4, 1, 2, 1, 2]
  - Output: 4

- Example 3:
  - Input: nums = [1]
  - Output: 1

#### Extra

This exercise uses the XOR (aka ```^=```)

Java XOR is one of the Bitwise operators available in Java. The XOR ( aka exclusive OR) takes two boolean operands and returns true if they are different. The best use case of the XOR operator is when both the given boolean conditions can't be true simultaneously.

For example, when we compare ```5``` to ```7``` using the XOR assignment we get ```2```

That's because bits are being compared, ```5 = 0101``` and ```7 = 0111``` then ```0101 XOR 0111 = 0010``` and then ```0010 = 2```
