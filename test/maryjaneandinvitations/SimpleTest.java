/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maryjaneandinvitations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zhuan
 */
public class SimpleTest {
    
    public SimpleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void typesTest() {
        int[] types=MaryJaneAndInvitations.getGuestTypes(5, "AROOXRO");
        int[] expectedTypes={0,2,1,2,1};
        Assert.assertArrayEquals(types,expectedTypes);
        
        types=MaryJaneAndInvitations.getGuestTypes(7, "AROOXXXAORA");
        expectedTypes=new int[]{0,0,1,1,1,2,0};
        Assert.assertArrayEquals(types,expectedTypes);
        
        types=MaryJaneAndInvitations.getGuestTypes(7, "AROOXXAOXARA");
        expectedTypes=new int[]{0,2,0,1,0,2,0};
        Assert.assertArrayEquals(types,expectedTypes);
        
        types=MaryJaneAndInvitations.getGuestTypes(7, "AROOXXAOXARAXXO");
        expectedTypes=new int[]{0,2,0,1,0,1,0};
        Assert.assertArrayEquals(types,expectedTypes);
    }
}
