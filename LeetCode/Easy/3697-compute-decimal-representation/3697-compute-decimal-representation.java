class Solution {
    public int[] decimalRepresentation(int n) {
        int[] arr = new int[10];
        int i = 0;
        int temp = 1;
        while (n > 0) {
            int rem = n % 10;
            if (rem != 0) arr[i++] = rem * temp;
            temp *= 10;
            n /= 10;
        }
        int[] result = new int[i];
        for (int j = 0; j < i; j++) result[j] = arr[i-1-j];
        

        return result;
    }
}
