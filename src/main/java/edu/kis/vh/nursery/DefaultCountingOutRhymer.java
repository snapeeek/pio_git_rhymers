package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer
{

    static final int[] INTS = new int[12];
    static final int INT = -1;
    private int[] NUMBERS = INTS;


    private int total = INT;

    public int getTotal()
    {
        return total;
    }

    public void countIn(int in)
    {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck()
    {
        return total == -1;
    }

    public boolean isFull()
    {
        return total == 11;
    }

    protected int peekaboo()
    {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut()
    {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
