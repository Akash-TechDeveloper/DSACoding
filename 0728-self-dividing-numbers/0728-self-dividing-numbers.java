class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left ; i<=right;i++){
            if(selfdivide(i)){
                list.add(i);
            }
        }
        return list;
    }
    private static boolean selfdivide(int n){
        int temp = n;
        while(temp!=0){
            int x = temp%10;
             if (x == 0 || n % x != 0) {
                return false;
            }
            temp/=10; 
        }
        return true;
    }
}