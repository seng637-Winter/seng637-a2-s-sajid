package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.*;

public class RangeTest {
    private Range exampleRange1;
    private Range exampleRange2;
    private Range exampleRange3;
    private Range exampleRange4;
    
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception { 
    	exampleRange1 = new Range(-1, 1);
    	exampleRange2 = new Range(-2, 2);
    	exampleRange3 = new Range(-1, 1);
    	exampleRange4 = exampleRange3;
    }
    
    @Test
    public void testEqualsNull() {
        assertFalse(exampleRange1.equals(null));
    }
    
    @Test
    public void testEqualsDifferentRanges() {
        assertFalse(exampleRange1.equals(exampleRange2));
    }

    @Test
    public void testEqualsReflexive() {
        assertTrue(exampleRange1.equals(exampleRange1));
    }
    
    @Test
    public void testEqualsSymmetric() {
        assertTrue(exampleRange1.equals(exampleRange3));
        assertTrue(exampleRange3.equals(exampleRange1));
    }
    
    @Test
    public void testEqualsTransitive() {
        assertTrue(exampleRange1.equals(exampleRange3));
        assertTrue(exampleRange3.equals(exampleRange4));
        assertTrue(exampleRange1.equals(exampleRange4));
    }

    @Test
    public void testEqualsConsistency() {
        assertFalse(exampleRange1.equals(null));
    }

    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}
