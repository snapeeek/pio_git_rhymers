package edu.kis.vh.nursery;

import edu.kis.vh.nursery.wrappers.IntArrayStack;

import java.util.ArrayList;

public class ListCountingOutRhymer extends DefaultCountingOutRhymer
{
    private ArrayList<Integer> arrayList;

    public ListCountingOutRhymer()
    {
        arrayList = new ArrayList<>();
    }

    public int getTotal() {return arrayList.size();}

    public void countIn(int in) {arrayList.add(in);}

    public boolean callCheck() {return arrayList.isEmpty();}

    public boolean isFull() {return arrayList.size()==11;}

    public int peekaboo() {return arrayList.get(arrayList.size()-1);}

    public int countOut() {return arrayList.remove(arrayList.size()-1);}
}
