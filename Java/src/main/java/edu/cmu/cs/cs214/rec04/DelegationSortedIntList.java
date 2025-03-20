package edu.cmu.cs.cs214.rec04;

public class DelegationSortedIntList implements IntegerList {
    private final SortedIntList sortedList;
    private int totalAdded;

    public DelegationSortedIntList() {
        this.sortedList = new SortedIntList();
        this.totalAdded = 0;
    }

    @Override
    public boolean add(int num) {
        totalAdded++;
        return sortedList.add(num);
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

    @Override
    public int get(int index) {
        return sortedList.get(index);
    }

    @Override
    public boolean remove(int num) {
        return sortedList.remove(num);
    }

    @Override
    public boolean removeAll(IntegerList list) {
        return sortedList.removeAll(list);
    }

    @Override
    public int size() {
        return sortedList.size();
    }

    public int getTotalAdded() {
        return totalAdded;
    }
}
