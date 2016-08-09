package com.tiy.ssa.weektwo.assignmentone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lists {

    private Lists(){
        
    }
    
    
    public static <T> List<T> match(List<T> one, List<T> other)
    {
        List<T> common = new ArrayList<T>();
        for(T s: one){
            if(!common.contains(s) && other.contains(s))
                common.add(s);
        }
        
        return common;
    }
    
    public static <T> List<T> same(List<T> one, List<T> other)
    {
        Set<T> common = new HashSet<T>();
        for(T s: one){
            if(!common.contains(s) && other.contains(s))
                common.add(s);
        }
        
        return new ArrayList<T>(common);
    }
    
    


    public static List<String> descendingBySize(List<String> input)
    {
       List<String> descending = new ArrayList<String>(input);
            
       Comparator<String> sort = new Comparator<String>(){
           public int compare(String first, String second){
               if(first.length() > second.length())
                   return -1;
               if(first.length() > second.length())
                   return 1;
               return 0;
           }
       };
       Collections.sort(descending, sort);
       return descending;
    }
}
