class Solution:
    def isValid(self, s: str) -> bool:
        Map = {")": "(", "]": "[", "}": "{"}
        stack = []

        for c in s:
            if c not in Map:
                stack.append(c)
                continue
            if not stack and Map[c] != s[-1]:
                return False
            stack.pop()

        return not stack

i = Solution()

print(i.isValid("{[]}"))

