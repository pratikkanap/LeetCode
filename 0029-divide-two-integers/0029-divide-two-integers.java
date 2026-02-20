class Solution {
    public int divide(int dividend, int divisor) {
        int reminder = dividend / divisor;
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        return reminder;
    }
}