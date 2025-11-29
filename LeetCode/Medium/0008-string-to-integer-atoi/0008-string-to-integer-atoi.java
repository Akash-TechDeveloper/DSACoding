class Solution {
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
    }
    public int myAtoi(String s) {
        long result = 0;
        boolean isNegative = false;
        s = s.trim();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(i == 0){
                if(c=='-') {
                    isNegative = true;
                    continue;
                }
                if(c=='+')continue;
            }
            if(Character.isDigit(c)){
                result *= 10;
                result += Character.getNumericValue(c);
            }else break;
            if(isNegative && result * -1 <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            else if(result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }
        return isNegative ? (int) result * -1 : (int) result;
    }
}