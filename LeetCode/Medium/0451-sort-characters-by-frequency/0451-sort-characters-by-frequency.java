class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            frequencySort(new String());
        }
    }
    public static String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> set : list){
            char c = set.getKey();
            int x = set.getValue();
            for(int i=0;i<x;i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}