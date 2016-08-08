package com.tiy.ssa.weektwo.assignmentone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lists {

    public static <T> List<T> match(List<T> one, List<T> other)
    {
        List<T> common = new ArrayList<T>(other);
        common.retainAll(one);
        return common;

    }


    public static List<String> descendingBySize(List<String> input)
    {

       Comparator<String> descending = new Comparator<String>(){
           public int compare(String first, String second){
               if(first.length() > second.length())
                   return -1;
               if(first.length() > second.length())
                   return 1;
               return 0;
           }
       };
       Collections.sort(input, descending);
       return input;
    }
}
