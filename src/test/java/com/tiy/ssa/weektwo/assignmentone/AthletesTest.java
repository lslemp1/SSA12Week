package com.tiy.ssa.weektwo.assignmentone;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tiy.ssa.weektwo.assignmentone.Athletes.Nationality;
import com.tiy.ssa.weektwo.assignmentone.Athletes.Sport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AthletesTest {

    List<Athletes> athletes = new ArrayList<>();

    @Before
    public void setup() {
        this.athletes.add(new Athletes("Alex Morgan", Nationality.AMERICAN, Sport.SOCCER));
        this.athletes.add(new Athletes("Cristiano Ronaldo", Nationality.PORTUGUESE, Sport.SOCCER));
        this.athletes.add(new Athletes("Michael Phelps", Nationality.AMERICAN, Sport.SWIMMING));
        this.athletes.add(new Athletes("Chris Davis", Nationality.AMERICAN, Sport.BASEBALL));
        this.athletes.add(new Athletes("Jose Bautista", Nationality.DOMINICAN, Sport.BASEBALL));
    }

    @After
    public void clear() {
        this.athletes.clear();
    }

    // test inclusive new ArrayList
    @Test
    public void nationals() {
        List<Athletes> americans = nationals(Nationality.AMERICAN);
        assertEquals("", 3, americans.size());
        
        List<Athletes> portuguese = nationals(Nationality.PORTUGUESE);
        assertEquals("", 1, portuguese.size());
        
        List<Athletes> dominican = nationals(Nationality.DOMINICAN);
        assertEquals("", 1, dominican.size());
    }

    // test exclusive new ArrayList
    @Test
    public void nonNationals() {
        List<Athletes> nonAmericans = nonNationals(Nationality.AMERICAN);
        assertEquals("", 2, nonAmericans.size());
        
        List<Athletes> nonPortuguese = nonNationals(Nationality.PORTUGUESE);
        assertEquals("", 4, nonPortuguese.size());
        
        List<Athletes> nonDominican = nonNationals(Nationality.DOMINICAN);
        assertEquals("", 4, nonDominican.size());
    }

    // create new ArrayList - inclusive
    List<Athletes> nationals(Nationality nation) {
        List<Athletes> nationals = new ArrayList<>();
        for (Athletes athlete : this.athletes) {
            if (nation == athlete.getNationality())
                nationals.add(athlete);
        }
        return nationals;
    }

    // create new ArrayList - exclusive
    List<Athletes> nonNationals(Nationality nation) {
        List<Athletes> nonNationals = new ArrayList<>();
        for (Athletes athlete : this.athletes) {
            if (nation != athlete.getNationality())
                nonNationals.add(athlete);
        }
        return nonNationals;
    }

    // modify existing ArrayList - inclusive
    @Test
    public void inclusiveSport() {
        for (Iterator<Athletes> iterator = this.athletes.iterator(); iterator.hasNext();) {
            Athletes next = iterator.next();
            if (next.getSport() != Sport.SOCCER)
                iterator.remove();
        }
        assertEquals("", 2, athletes.size());
    }

    // modify current ArrayList - exclusive
    @Test
    public void exclusiveSport() {
        for (Iterator<Athletes> iterator = this.athletes.iterator(); iterator.hasNext();) {
            Athletes next = iterator.next();
            if (next.getSport() == Sport.SOCCER)
                iterator.remove();
        }
        assertEquals("", 3, athletes.size());
    }

}
