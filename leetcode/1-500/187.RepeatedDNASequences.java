class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<11){
            return new ArrayList<>();
        }
        Set<String> set = new HashSet<>();
        Map<String, Integer> m = new HashMap<>();
        StringBuilder dna = new StringBuilder(s.substring(0,10));
        m.put(dna.toString(), 1);
        for(int i = 10 ; i < s.length(); i++){
            dna.deleteCharAt(0);
            dna.append(s.charAt(i));
            String str = dna.toString();
            int c = m.getOrDefault(str,0)+1;
            if(c>1){
                set.add(str);
            }
            m.put(str, c);
        }
        return new ArrayList<>(set);
    }
}
//https://leetcode.com/problems/repeated-dna-sequences/