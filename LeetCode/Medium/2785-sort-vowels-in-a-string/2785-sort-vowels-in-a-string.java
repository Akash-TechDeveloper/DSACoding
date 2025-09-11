class Solution {
    public String sortVowels(String s) {
        // StringBuilder sb = new StringBuilder();
        // int st = 0;
        // String s = "AEIOUaeiou";
        // for(int i=0;i<s.length();i++){
        //     if(s.contains(s.charAt(st))){

        //     }
        //     sb.append(s.charAt(i));
        //
        // Set<Character> set = new HashSet<>();
        //   set.add('A'); set.add('a');
        //   set.add('E'); set.add('e');
        //   set.add('I'); set.add('i');
        //   set.add('O'); set.add('o');
        //   Set.add('U'); set.add('u');
        // List<>  
        char[] chars = s.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (isVowel(c)) {
                count++;
            }
        }
        char[] vowel = new char[count];
        int k = 0;
        for (char c : chars) {
            if (isVowel(c)) {
                vowel[k] = c;
                k++;
            }
        }
        Arrays.sort(vowel);

        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                chars[i] = vowel[j];
                j++;
            }
        }
        return new String (chars);
    }
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) >= 0;
    }
}