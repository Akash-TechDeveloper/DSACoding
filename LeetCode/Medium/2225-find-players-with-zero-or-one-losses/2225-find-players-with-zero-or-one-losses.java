class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Integer> map = new HashMap<>();
         for (int i = 0; i < matches.length; i++) {
            map.put(matches[i][1], map.getOrDefault(matches[i][1], 0) + 1);
            map.put(matches[i][0], map.getOrDefault(matches[i][0], 0));
        }
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        for(Map.Entry<Integer,Integer> hm : map.entrySet()){
            if(hm.getValue()==0){
                list.get(0).add(hm.getKey());
            }
            else if (hm.getValue()==1) list.get(1).add(hm.getKey());
        }
        Collections.sort(list.get(0));
        Collections.sort(list.get(1));

        return list;
    }
}