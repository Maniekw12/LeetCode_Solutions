#group anagrams

from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: list[str]):
        #defaultowy klucz - lista
        dict = defaultdict(list)


        for s in strs:
            count = [0] * 26 #it represents all letters

            for c in s:
                count[ord(c) - ord("a")] +=1

            dict[tuple(count)].append(s)
        return dict.values()








