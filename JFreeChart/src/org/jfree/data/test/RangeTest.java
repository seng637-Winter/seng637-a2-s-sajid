package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.*;

public class RangeTest {
    
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception { 
    }
    
    // Test case covering null comparison where r1 != null
    @Test
    public void testEqualsNull() {
    	Range r = new Range(-10, 10);
        assertFalse(r.equals(null));
    }
    
    // Test case covering different range comparison where r1 != r2
    @Test
    public void testEqualsDifferentRanges() {
    	Range r1 = new Range(-10, 10);
    	Range r2 = new Range(-2, 7);
        assertFalse(r1.equals(r2));
    }

    // Test case covering reflexive comparison where r == r
    @Test
    public void testEqualsReflexive() {
    	Range r = new Range(-10, 10);
        assertTrue(r.equals(r));
    }
    
    // Test case covering symmetric comparison where r1 == r2
    @Test
    public void testEqualsSymmetric() {
    	Range r1 = new Range(-10, 10);
    	Range r2 = new Range(-10, 10);
    	assertTrue(r1.equals(r2) && r2.equals(r1));
    }
    
    // Test case covering transitive comparison where r1 == r2 == r3
    @Test
    public void testEqualsTransitive() {
    	Range r1 = new Range(-10, 10);
    	Range r2 = new Range(-10, 10);
    	Range r3 = new Range(-10, 10);
    	assertTrue(r1.equals(r2) && r2.equals(r3) && r1.equals(r3));
    }

    // Test case covering consistency of equals method where r1 == r2
    @Test
    public void testEqualsConsistency() {
    	Range r1 = new Range(-10, 10);
    	Range r2 = new Range(-10, 10);
        assertTrue(r1.equals(r2) == r2.equals(r1));
    }
    

    // Test with a range from -infinity to infinity
    @Test
    public void testEqualsEdgeCaseInfinity() {
    	Range r1 = new Range(-10, 10);
    	Range r2 = new Range(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    	Range r3 = r2;
        assertFalse(r1.equals(r2));
        assertTrue(r2.equals(r3));
    }
        
    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}
