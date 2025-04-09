package edu.iu.habahram.DinerPancakeHouseMerge.repository;


import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseIterator implements Iterator<MenuItem> {
    private List<MenuItem> items;
    private int position = 0;

    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }


    public boolean hasNext() {
        return position < items.size() && items.get(position) != null;
    }

    public MenuItem next() {
        MenuItem item = items.get(position);
        position++;
        return item;
    }


    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        items.remove(position - 1);
        position--;
    }
}