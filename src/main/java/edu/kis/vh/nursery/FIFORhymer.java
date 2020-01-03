package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer
{

    DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut()
    {
        while (!callCheck())

            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return ret;
    }
}
