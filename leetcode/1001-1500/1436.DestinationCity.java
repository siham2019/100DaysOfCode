class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String,String> m = new HashMap<>();
        for(List<String> l : paths){
            m.put(l.get(0),l.get(1));
        }
        String destination = m.get(paths.get(0).get(0));
        while(m.get(destination)!=null){
            destination = m.get(destination);            
        }
        return destination;
    }
}
//https://leetcode.com/problems/destination-city/