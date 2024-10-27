class Solution:
    def isPalindrome(self, s: str) -> bool:

        left = 0
        right = len(s)-1

        # isalnum() checks if char is a character
        while left < right:
            while not s[right].isalnum() and left < right:
                right -=1

            while not s[left].isalnum() and left < right:
                left += 1
            print(s[left].lower() + s[right].lower())
            if s[left].lower() != s[right].lower():

                return False
            left +=1
            right -=1


        return True



i = Solution()

print(i.isPalindrome("duu D"))


