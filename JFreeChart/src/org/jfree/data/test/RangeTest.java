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
    	r1 = new Range(-10, 10);
    	r2 = new Range(-2, 7);
    	r3 = new Range(-10, 10);
    }
    
    // Test case covering null comparison where r1 != null
    @Test
    public void testEqualsNull() {
        assertFalse(r1.equals(null));
    }
    
    // Test case covering different range comparison where r1 != r2
    @Test
    public void testEqualsDifferentRanges() {
        assertFalse(r1.equals(r2));
    }

    // Test case covering reflexive comparison where r1 == r1
    @Test
    public void testEqualsReflexive() {
        assertTrue(r1.equals(r1));
    }
    
    // Test case covering symmetric comparison where r1 == r3
    @Test
    public void testEqualsSymmetric() {
    	assertTrue(r1.equals(r3) && r3.equals(r1));
    }
    
    // Test case covering transitive comparison where r1 == r3 == r4
    @Test
    public void testEqualsTransitive() {
    	Range r4 = r3;
    	assertTrue(r1.equals(r3) && r3.equals(r4) && r1.equals(r4));
    }

    // Test case covering consistency of equals method where r1 == r3
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
