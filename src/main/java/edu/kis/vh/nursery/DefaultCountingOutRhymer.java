package edu.kis.vh.nursery;

import edu.kis.vh.nursery.wrappers.IntArrayStack;

public class DefaultCountingOutRhymer
{
    private IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack)
    {
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRhymer()
    {
        intArrayStack = new IntArrayStack();
    }

    public int getTotal() {return intArrayStack.getTotal();}

    public void countIn(int in) {intArrayStack.countIn(in);}

    public boolean callCheck() {return intArrayStack.callCheck();}

    public boolean isFull() {return intArrayStack.isFull();}

    public int peekaboo() {return intArrayStack.peekaboo();}

    public int countOut() {return intArrayStack.countOut();}
}
