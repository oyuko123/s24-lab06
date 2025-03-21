package edu.cmu.cs.cs214.rec04;

public class InheritanceSortedIntList extends SortedIntList {
    private int totalAdded;

    public InheritanceSortedIntList() {
        super();
        totalAdded = 0;
    }

    @Override
    public boolean add(int num) {
        totalAdded++;
        return super.add(num);
    }

    @Override
    public boolean addAll(IntegerList list) {
        boolean changed = false;
        for (int i = 0; i < list.size(); i++) {
            if (add(list.get(i))) { 
                changed = true;
            }
        }
        return changed;
    }

    public int getTotalAdded() {
        return totalAdded;
    }

}
