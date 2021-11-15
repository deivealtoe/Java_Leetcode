### Problem:

#### Given an array nums of size n, return the majority element.

#### The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

- Example 1:
  - Input: nums = [3,2,3]
  - Output: 3

- Example 2:
  - Input: nums = [2,2,1,1,1,2,2]
  - Output: 2

#### Learn more about Boyer-Moore Voting Algorithm solution

Since the majority element is the element that appears more than ```n / 2``` times. Boyce-Moore Voting Algorith can be applied without any problem. However, in a scenario that majority element does not appear more than ```n / 2``` it fails.

Example for example, ```int[] nums = { 1, 1, 1, 10, 10, 10, 10, 3, 10, 1, 10 }```. It would return ```1```.