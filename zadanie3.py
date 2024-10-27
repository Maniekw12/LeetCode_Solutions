#Two sum

class Solution(object):
    def twoSum(self, nums, target):
        n = len(nums)

        if nums == 0:
            return []
        dict = {}

        for i in range(n):
            dict[nums[i]] = i

        for i in range(n):
            complement = target - nums[i]
            if complement in dict:
                return [i, dict[complement]]

        return []




