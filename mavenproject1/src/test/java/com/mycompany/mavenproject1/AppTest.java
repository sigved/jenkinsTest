package com.mycompany.mavenproject1;

import java.lang.reflect.Constructor;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testAlwaysTrue(){
        assertTrue(App.alwaysTrue());
    }
    
    public void testAlwaysFalse(){
        assertFalse(App.alwaysFalse());
    }
    
    public void testConstructor(){
        try{
            Constructor<?>[] cons = App.class.getDeclaredConstructors();
            cons[0].setAccessible(true);
            cons[0].newInstance(new Object[]{});
        }catch(Exception e){
            fail("constructor fails");
        }
    }
    
    public void testMain(){
        App.main(new String[]{});
    }
}
