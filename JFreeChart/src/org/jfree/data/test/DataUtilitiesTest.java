package org.jfree.data;

import static org.junit.Assert.*;
import org.jmock.*;
import org.junit.*;

public class DataUtilitiesTest {
	private Mockery mockingContext;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.mockingContext = new Mockery();
	}
    
    @Test
    public void testCreateNumberArrayWithValidData() {
        final double[] values = {1.0, 2.3, 9.9};
        Number[] result = DataUtilities.createNumberArray(values);
        
        for (int i = 0; i < result.length; i++) {
        	assertEquals(values[i], result[i]);
        }
    }
 
    @Test
    public void testCreateNumberArrayWithNegativeValues() {
        final double[] values = {-1.0, -2.3, -9.9, -1.3};
        Number[] result = DataUtilities.createNumberArray(values);
      
        for (int i = 0; i < values.length; i++) {
            assertEquals(values[i], result[i]);
        }
    }
    
    @Test
    public void testCreateNumberArrayWithZeroValues() {
        final double[] values = {0.0, 0.0, 0.0};
        Number[] result = DataUtilities.createNumberArray(values);
        
        for (int i = 0; i < values.length; i++) {
            assertEquals(values[i], result[i]);
        }
    }
}