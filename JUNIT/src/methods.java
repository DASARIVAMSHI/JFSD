

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class methods {
	@Test

	public void Setup() {
		String str="klh";
		String str1="klh";
        String str2="edu";
        String str3=null;
        String str4="edu";
        int val=5;
        int val1=7;
        String [] expectedArray= {"one","two","three",};
        String [] resultArray= {"one","two","three"};
        // assertEquals:checks whether two primitives/objects/strings are same
        assertEquals(str,str1);		
        
        //assertTrue:-check whether the condition is true nor not
        assertTrue(val<val1);
        //assertflase:-check whether the condition is flase or not
        assertFalse(val==val1);
        //assertnull :-check whether the value is null or not
        assertNull(str3);
        //assertnot null:-checks whether the value is not null
        assertNotNull(val);
        //assertArrayEquals:-chech whether the given array and expected is same or not
        assertArrayEquals(expectedArray,resultArray);
        //assertsame:-compare using refrences and checks whether they are same or not
        assertSame(str,str1);
        //assertnotsame
        assertNotSame(str,str2);

}

}
