class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        int val=0;
        if(n%2!=0){
            arr[val++]=0;
        }
        for(int i=1;i<=n/2;i++){
            arr[val++] = i;
            arr[val++] = -i;
        }
    return arr;
    }
}