package org.example;

public class Fibonacci {

    /**
     * Return the <code>n</code>th Fibonacci number.
     *
     * @param n the index into the Fibonacci series. <code>n</code> is positive and less than 93.
     * @return if <code>n</code> < 0 or <code>n</code> > 92 then -1;
     * else if <code>n</code> < 2 then <code>n</code>;
     * else <code>fibN(n-1)</code> + <code>fibN(n-2)</code>.
     */
    public long fibN(int n) {
        return -1L;
    }

    /**
     * Determine the sum of the first <code>n</code> Fibonacci numbers.
     *
     * @param n the index into the Fibonacci series. <code>n</code> is positive and less than 93.
     * @return the sum of the Fibonacci numbers 0 through n.
     */
    public long sumN(int n) {
         return -1L;
    }

    public Fibonacci() {
    }

    private final long[] memo = new long[93];
}