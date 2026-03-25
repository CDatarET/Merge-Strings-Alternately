class Solution:
    def mergeAlternately(self, word1, word2):
        l = 0
        r = 0
        w1 = True
        sb = []
        while l < len(word1) and r < len(word2):
            if w1:
                sb.append(word1[l])
                l += 1
                w1 = False
            else:
                sb.append(word2[r])
                r += 1
                w1 = True
        
        if l == len(word1):
            for i in range(r, len(word2)):
                sb.append(word2[i])
        else:
            for i in range(l, len(word1)):
                sb.append(word1[i])

        return "".join(sb)
