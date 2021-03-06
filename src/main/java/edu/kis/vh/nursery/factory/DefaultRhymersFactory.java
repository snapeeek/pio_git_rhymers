package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.ListCountingOutRhymer;

//alt i strzałka w prawo lub w lewo przełączają otwarte pliki
//w sumie podpunkt z nazewnictwem zrobilem juz w branchu format, zagalopowałem się!

public class DefaultRhymersFactory implements RhymersFactory
{
    @Override
    public DefaultCountingOutRhymer getStandardRhymer()
    {
        return new DefaultCountingOutRhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFalseRhymer()
    {
        return new ListCountingOutRhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFIFORhymer()
    {
        return new FIFORhymer(/*new DefaultCountingOutRhymer()*/);
    }

    @Override
    public DefaultCountingOutRhymer getHanoiRhymer()
    {
        return new HanoiRhymer(0);
    }
}
