package edu.kis.vh.nursery;

import edu.kis.vh.nursery.wrappers.IntArrayStack;

//wydaje mi się że najlepszym wyborem jest właśnie IntArrayStack, ale nie dam sobie o to ręki uciąć

public class FIFORhymer extends DefaultCountingOutRhymer
{
    IntArrayStack temp = new IntArrayStack();

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
