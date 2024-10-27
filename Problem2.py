#is Anagram

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s = s.lower()
        t = t.lower()
        if(len(s) != len(t)):
            return False
        dict1 = {}

        for char in s:
            if char in dict1:
                dict1[char] += 1
            else:
                dict1[char] = 1


        for char in t:
            if char in dict1:
                dict1[char] -=1
                if dict1[char] ==0:
                    del dict1[char]
            else:
                return False


        return True

