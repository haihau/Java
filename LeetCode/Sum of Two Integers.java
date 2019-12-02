class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int plus = (a & b) << 1;
            a = a ^ b;
            b = plus;
        }
        return a;
    }
}

or

class Solution {
    public int getSum(int a, int b) {
        return Integer.sum(a,b);
    }
}