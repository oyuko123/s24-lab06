package edu.cmu.cs.cs214.rec04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedIntList implements IntegerList {
    private final List<Integer> list;

    public SortedIntList() {
        list = new ArrayList<>();
    }

    @Override
    public boolean add(int num) {
        boolean added = list.add(num);
        Collections.sort(list);
        return added;
    }

    @Override
    public boolean addAll(IntegerList other) {
        boolean changed = false;
        for (int i = 0; i < other.size(); i++) {
            changed |= add(other.get(i));
        }
        return changed;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Index out of range.");
        }
        return list.get(index);
    }

    @Override
    public boolean remove(int num) {
        return list.remove((Integer) num);
    }

    @Override
    public boolean removeAll(IntegerList other) {
        boolean changed = false;
        for (int i = 0; i < other.size(); i++) {
            changed |= remove(other.get(i));
        }
        return changed;
    }

    @Override
    public int size() {
        return list.size();
    }
}
