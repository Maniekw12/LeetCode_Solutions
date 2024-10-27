#Encode and decode

class Solution:

    def encode(self, strs) -> str:
        res = ""
        for s in strs:
            res += str(len(s)) + "#" + s


    def decode(self, s):
        res = []
        i = 0

        while i < len(s):
            j = i
            while s[j] != "#":
                j = j+1
            length = int[i:j]
            i = j +1
            j = i + length

            res.append(s[i:j])
        return res
