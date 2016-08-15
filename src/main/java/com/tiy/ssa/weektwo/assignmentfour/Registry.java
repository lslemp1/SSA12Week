package com.tiy.ssa.weektwo.assignmentfour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tiy.ssa.weektwo.assignmentthree.SocialSecurityNumber;

public class Registry {

    final Map<SocialSecurityNumber, Person> registry = new HashMap<SocialSecurityNumber, Person>();

    // change the state of the registry
    public boolean add(Person person) {
        if (!registry.containsValue(person)) {
            registry.put(person.ssn, person);
            return true;
        } else {
            return false;
        }
    }

    // oldest ancestor
    public Person progenitor(SocialSecurityNumber ssn) {
        
        List<Person> oldestAncestor = this.ancestors(ssn);

        if (oldestAncestor.isEmpty())
            return registry.get(ssn);
        return oldestAncestor.stream().max(Comparator.comparing(Person::age)).get();

    }

    // return oldest living relative
    public Person oldestLivingRelative(SocialSecurityNumber ssn) {
        
        
        return null;
    }

    // list all ancestors. if none, return empty list.
    public List<Person> ancestors(SocialSecurityNumber ssn) {        
        
        Person p = registry.get(ssn);
        List<Person> ancestors1 = new ArrayList<>();
        List<Person> ancestors2 = new ArrayList<>();
        
        if (registry.get(ssn).getParentI() != null)
            ancestors2.add(p.getParentI());
        if (registry.get(ssn).getParentII() != null)
            ancestors2.add(p.getParentII());
        
        while (ancestors2.size() > 0) {
            if (ancestors2.get(0).getParentI() != null)
                ancestors2.add(ancestors2.get(0).getParentI());
            if (ancestors2.get(0).getParentII() != null)
                ancestors2.add(ancestors2.get(0).getParentII());
            ancestors1.add(ancestors2.remove(0));
        }

        return ancestors1;
        
               
    }

    // list all descendants. if none, return empty list.
    public List<Person> descendants(SocialSecurityNumber ssn) {
        
//      if (registry.get(ssn).getChildren().size() > 0) {
//      for (Person p : registry.get(ssn).getChildren()) {
//          p.getChildren().addAll(descendants(p.getSSN()));
//      }
//      return registry.get(ssn).getChildren();
//  } else
//      return new ArrayList<>();
        
        List<Person> descendants1 = new ArrayList<>();
        List<Person> descendants2 = registry.get(ssn).getChildren();
        
        while (descendants2.size() > 0){
            descendants2.addAll(descendants2.get(0).getChildren());
            descendants1.add(descendants2.remove(0));
        } 
        
        return descendants1;
    }

    // youngest descendant
    public Person youngestDescendant(SocialSecurityNumber ssn) 
    {
        List<Person> youngest = this.descendants(ssn);

        if (youngest.isEmpty())
            return registry.get(ssn);

        return youngest.stream().min(Comparator.comparing(Person::age)).get();
    }

    // related?
    public boolean areRelated(SocialSecurityNumber one, SocialSecurityNumber two) {
        return true;
    }

    // return SSN
    public Person get(SocialSecurityNumber ssn) {
        return registry.get(ssn);
    }

    // relationship between 2 people
    public Relationship related(SocialSecurityNumber one, SocialSecurityNumber two) {
        return null;
    }

    // return number of people in registry
    public int size() {
        return registry.size();
    }

    public static enum Relationship {
        PARENT, CHILD, GRANDPARENT, GRANDCHILD, COUSIN, SIBLING, NIBLING, AUNCLE, NONE;
    }

    @Override
    public String toString() {
        return registry.toString();
    }

}
