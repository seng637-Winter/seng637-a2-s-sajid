package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

public class EqualsTest {

    @Test
    public void testReflexive() {
    	EqualsTest obj = new EqualsTest();
        assertTrue(obj.equals(obj));
    }

    @Test
    public void testSymmetric() {
    	EqualsTest obj1 = new EqualsTest();
    	EqualsTest obj2 = new EqualsTest();
    	assertTrue(obj1.equals(obj2) && obj2.equals(obj1));
    }

    @Test
    public void testTransitive() {
    	EqualsTest obj1 = new EqualsTest();
    	EqualsTest obj2 = new EqualsTest();
    	EqualsTest obj3 = new EqualsTest();
    	assertTrue(obj1.equals(obj2) && obj2.equals(obj3) && obj1.equals(obj3));
    }

    @Test
    public void testConsistent() {
    	EqualsTest obj1 = new EqualsTest();
    	EqualsTest obj2 = new EqualsTest();
    	assertTrue(obj1.equals(obj2) == obj1.equals(obj2));
    }

    @Test
    public void testNull() {
    	EqualsTest obj = new EqualsTest();
        assertFalse(obj.equals(null));
    }
    
    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}