package org.jfree.data;

import static org.junit.Assert.*;
import org.jmock.Mockery;
import org.jmock.Expectations;
import org.junit.Test;

public class DataUtilitiesTest {

    @Test
    public void calculateColumnTotalForTwoValues() {
        // setup
        Mockery mockingContext = new Mockery();
        final Values2D values = mockingContext.mock(Values2D.class);

        mockingContext.checking(new Expectations() {{
            oneOf(values).getRowCount();
            will(returnValue(2));
            oneOf(values).getValue(0, 0);
            will(returnValue(7.5));
            oneOf(values).getValue(1, 0);
            will(returnValue(2.5));
        }});

        // exercise
        double result = DataUtilities.calculateColumnTotal(values, 0);

        // verify
        assertEquals(10.0, result, .000000001d);

        // tear-down: NONE in this test method
    }
}