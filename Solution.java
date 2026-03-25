class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l = 0;
        int r = 0;
        boolean w1 = true;
        StringBuilder sb = new StringBuilder();
        while(l < word1.length() && r < word2.length()){
            if(w1){
                sb.append(word1.charAt(l++));
                w1 = false;
            }
            else{
                sb.append(word2.charAt(r++));
                w1 = true;
            }
        }

        if(l == word1.length()){
            for(int i = r; i < word2.length(); i++){
                sb.append(word2.charAt(i));
            }
        }
        else{
            for(int i = l; i < word1.length(); i++){
                sb.append(word1.charAt(i));
            }
        }

        return(sb.toString());
    }
}
