package com.tiy.ssa.weekthree.assignmenttwo;

import java.util.Iterator;

public class FixFor<T> implements Iterator<T>, Iterable<T> {

    final Iterator<T> decorated;
    
    public FixFor(Iterator<T> decorated){
        this.decorated = decorated;
    }
    
    @Override
    public boolean hasNext(){
        return this.decorated.hasNext();
    }
    
    @Override
    public T next(){
        return this.decorated.next();
    }
    
    @Override
    public Iterator<T> iterator(){
        //this.iterator
        return this;
    }
    
    @Override
    public void remove(){
        this.decorated.remove();
    }
}
