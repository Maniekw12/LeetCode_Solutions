#has Duplicate
class Solution:
    def hasDuplicate(self, nums) -> bool:
        return len(nums) != len(set(nums))

#len - dlugosc w pythonie
# Trik ze stringami i z setami
