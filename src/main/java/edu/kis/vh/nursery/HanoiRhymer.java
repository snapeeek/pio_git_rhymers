package edu.kis.vh.nursery;

import edu.kis.vh.nursery.wrappers.IntArrayStack;

public class HanoiRhymer extends DefaultCountingOutRhymer
{

    public HanoiRhymer(IntArrayStack intArrayStack, int totalRejected)
    {
        super(intArrayStack);
        this.totalRejected = totalRejected;
    }

    public HanoiRhymer(int totalRejected)
    {
        this.totalRejected = totalRejected;
    }

    int totalRejected;

    public int reportRejected()
    {
        return totalRejected;
    }

    @Override
    public void countIn(int in)
    {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
