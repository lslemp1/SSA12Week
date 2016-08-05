package com.tiy.ssa.weekone.assignmentfour;

public class LocationRefactored {

    public final int x, y;
    
public LocationRefactored(int x, int y){
        
        this.x = x;
        this.y = y;
    }
    
    @Override
    public int hashCode(){
        int hash = 5;
        hash = 23 * hash + this.x;
        hash = 23 * hash + this.y;
        return hash;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        final LocationRefactored other = (LocationRefactored) obj;
        if(this.x != other.x){
            return false;
        }
        if(this.y != other.y){
            return false;
        }
        return true;
    }

    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }

public LocationRefactored offset(int x, int y){
    return new LocationRefactored(this.x + x, this.y + y);
}
}
