package edu.kis.vh.nursery.wrappers;


public class IntArrayStack implements edu.kis.vh.nursery.wrappersinterfaces.IntArrayStackInterface
{
    static final int[] INTS = new int[12];
    static final int INT = -1;
    private int[] NUMBERS = INTS;

    private int total = INT;

    @Override
    public int getTotal()
    {
        return total;
    }

    @Override
    public void countIn(int in)
    {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    @Override
    public boolean callCheck()
    {
        return total == -1;
    }

    @Override
    public boolean isFull()
    {
        return total == 11;
    }

    public int peekaboo()
    {
        if (callCheck())
            return 0;
        return NUMBERS[total];
    }

    @Override
    public int countOut()
    {
        if (callCheck())
            return 0;
        return NUMBERS[total--];
    }
}
