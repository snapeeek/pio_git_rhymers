package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.ListCountingOutRhymer;
import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class ArrayRhymersFactory implements RhymersFactory
{

    @Override
    public DefaultCountingOutRhymer getStandardRhymer()
    {
        return new ListCountingOutRhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFalseRhymer()
    {
        return new DefaultCountingOutRhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFIFORhymer()
    {
        return new FIFORhymer();
    }

    @Override
    public DefaultCountingOutRhymer getHanoiRhymer()
    {
        return new HanoiRhymer(0);
    }
}
