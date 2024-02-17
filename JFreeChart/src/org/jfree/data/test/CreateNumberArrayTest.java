package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jmock.*;
import org.junit.*;

public class CreateNumberArrayTest {
	private double[] data;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		data = new double[]{1.1, 2.2, 3.3};
	}
    
    // Test to ensure that a null value is not permitted.
    @Test(expected = IllegalArgumentException.class)
    public void createNumberArrayNullException() {
        double[] data = null;
        DataUtilities.createNumberArray(data);
    }
    
    // Test to verify that a valid input returns a non-null array.
    @Test
    public void createNumberArrayValidInputReturnsArray() {
        Number[] result = DataUtilities.createNumberArray(data);
        assertNotNull(result);
    }
    
    // Test to verify that a valid input returns an array with the correct length.
    @Test
    public void createNumberArrayValidInputReturnsArrayLength() {
        Number[] result = DataUtilities.createNumberArray(data);
        assertEquals(data.length, result.length);
    }
    
    // Test to verify that a valid input returns an array with correct values.
    @Test
    public void createNumberArrayValidInput() {
        Number[] result = DataUtilities.createNumberArray(data);
        for (int i = 0; i < data.length; i++) {
            assertEquals(data[i], result[i]);
        }
    }
 
    // Test to verify that a large input returns an array with the correct length.
    @Test
    public void createNumberArrayLargeInputReturnsArrayLength() {
        double[] data = new double[1000];
        for (int i = 0; i < 1000; i++) {
            data[i] = i * 0.5;
        }
        Number[] result = DataUtilities.createNumberArray(data);
        assertEquals(data.length, result.length);
    }
    
    // Test to verify that a large input returns an array with correct values.
    @Test
    public void createNumberArrayLargeInputReturnsArray() {
        double[] data = new double[1000];
        for (int i = 0; i < 1000; i++) {
            data[i] = i * 0.5;
        }
        Number[] result = DataUtilities.createNumberArray(data);
        for (int i = 0; i < data.length; i++) {
            assertEquals(data[i], result[i]);
        }
    }
    
    // Test to verify that a valid integer input returns an array with the correct length.
    @Test
    public void createNumberArrayValidIntegerInputReturnsArrayLength() {
        double[] data = {1, 2, 3, 4, 5};
        Number[] result = DataUtilities.createNumberArray(data);
        assertEquals(data.length, result.length);
    }

    // Test to verify that an array with zero values returns an array with correct values.
    @Test
    public void testCreateNumberArrayWithZeroValues() {
        double[] data = {0.0, 0.0, 0.0};
        Number[] result = DataUtilities.createNumberArray(data);
        
        for (int i = 0; i < data.length; i++) {
            assertEquals(data[i], result[i]);
        }
    }
}