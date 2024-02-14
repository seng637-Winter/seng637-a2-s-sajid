package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.*;

public class RangeTest {
    private Range r1;
    private Range r2;
    private Range r3;
    
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception { 
    	r1 = new Range(-1, 1);
    	r2 = new Range(-2, 2);
    	r3 = new Range(-1, 1);
    }
    
    @Test
    public void testEqualsNull() {
        assertFalse(r1.equals(null));
    }
    
    @Test
    public void testEqualsDifferentRanges() {
        assertFalse(r1.equals(r2));
    }

    @Test
    public void testEqualsReflexive() {
        assertTrue(r1.equals(r1));
    }
    
    @Test
    public void testEqualsSymmetric() {
    	assertTrue(r1.equals(r3) && r3.equals(r1));
    }
    
    @Test
    public void testEqualsTransitive() {
    	Range r4 = r3;
    	assertTrue(r1.equals(r3) && r3.equals(r4) && r1.equals(r4));
    }

    @Test
    public void testEqualsConsistency() {
        assertTrue(r1.equals(r3) == r3.equals(r1));
    }
    
    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}
