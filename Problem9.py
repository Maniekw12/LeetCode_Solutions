class Solution:
    def twoSum(self, numbers, target):
        left = 0
        right = len(numbers) - 1

        while right > left:

            current_sum = numbers[left] + numbers[right]
            if current_sum == target:
                return [numbers[left],numbers[right]]
            elif current_sum < target:
                left += 1
            else:
                right -=1

        return []