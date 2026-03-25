public class Solution {
    public string MergeAlternately(string word1, string word2) {
        int l = 0;
        int r = 0;
        bool w1 = true;
        StringBuilder sb = new StringBuilder();
        while(l < word1.Length && r < word2.Length){
            if(w1){
                sb.Append(word1[l++]);
                w1 = false;
            }
            else{
                sb.Append(word2[r++]);
                w1 = true;
            }
        }

        if(l == word1.Length){
            for(int i = r; i < word2.Length; i++) sb.Append(word2[i]);
        }
        else{
            for(int i = l; i < word1.Length; i++) sb.Append(word1[i]);
        }

        return(sb.ToString());
    }
}
