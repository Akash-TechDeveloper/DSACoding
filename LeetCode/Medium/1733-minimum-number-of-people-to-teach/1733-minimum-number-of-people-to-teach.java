class Solution {
    public int minimumTeachings(int n, int[][] lang, int[][] friends) {
        // int freq[] = new int [n+1];
        // int max = 0;
        // for(int lang[] : languages){
        //     freq[lang]++;
        //     max=Math.max(freq[lang],max);
        // }
        // return languages.length-max;
        int m = lang.length;
        Set<Integer>[] langs = new HashSet[m+1];
        for(int i = 0; i < m; i++){
            langs[i+1] = new HashSet<>();
            for(int lan:lang[i]){
                langs[i+1].add(lan);
            }
        }
        Set<Integer> notcommon = new HashSet<>();
        for(int []friend : friends){
            int u = friend[0];
            int v = friend[1];
            if(!talks(langs[u],langs[v])){
                notcommon.add(u);
                notcommon.add(v);
            }
        }
        if(notcommon.isEmpty()) return 0;
        int freq[] = new int [n+1];
        for(int user : notcommon){
            for(int lan : langs[user]){
                freq[lan]++;
            }
        }
        int maxfreq=0;
        for(int i=0;i<n+1;i++){
            if(freq[i]>maxfreq) maxfreq=freq[i];
        }
        return notcommon.size()-maxfreq;
    }
    private boolean talks(Set<Integer> u ,Set<Integer> v){
        if(u.size()>v.size()) return talks(v,u);
        for(int lang:u){
           if(v.contains(lang)) return true;
        }
        return false;
    }
}