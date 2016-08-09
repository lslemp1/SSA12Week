
package com.tiy.ssa.weektwo.assignmenttwo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserTest {

    Collection<User> users = new ArrayList<>();

    @Before
    public void setup() {
        users.add(new User("Cal", "Morrison", 12));
        users.add(new User("Art", "Bell", 14));
        users.add(new User("Charlotte", "Manning", 8));
        users.add(new User("Kira", "Manning", 10));
        users.add(new User("Kira", "Manning", 10));
        users.add(new User("Sarah", "Manning", 25));
        users.add(new User("Alison", "Hendrix", 16));
        users.add(new User("Helena", "Smith", 30));
        users.add(new User("Delphine", "Cormier", 32));
        users.add(new User("Evie", "Cho", 40));
    }

    @After
    public void clear(){
        users.clear();
    }
    
    
    @Test
    public void childTest() 
    {
        Collection<Name> childNames = new ArrayList<Name>(children(users));
        assertEquals(4, childNames.size());
    }
    

    @Test
    public void adultTest() 
    {
        float avg = adultAverageAge(users);
        assertEquals(28.6, avg,.05);
    }
    

    static Collection<Name> children(Collection<? extends User> users) 
    {
        Collection<Name> children = new HashSet<>();
        for (User s : users) {
            if (s.child())
                children.add(new Name(s.getFirstName(), s.getLastName()));
        }
        return children;
    }
    

    static float adultAverageAge(Collection<? extends User> users) 
    {
        int ageSum = 0, numAdults = 0;
        float avg = 0.0f;

        for (User s : users) {
            if (!s.child()) {
                ageSum += s.getAge();
                numAdults++;
            }
        }

        avg = (float)ageSum / (float)numAdults;
        return avg;

    }
}
