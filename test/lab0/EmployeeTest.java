package lab0;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mjmersenski
 */
public class EmployeeTest {
    private Employee e;
    
    public EmployeeTest() {
    }
    
    @Before
    public void setUp() {
        e = new Employee();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void firstNameNullShouldThrowException(){
        e.setFirstName(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void firstNameEmptyShouldThrowException(){
        e.setFirstName("");
    }
    
    @Test
    public void firstNameValidShouldBeAllowed(){
        String[] testValues = {"Bob","Boooooooooooobby","B","123"," b o b "," ", "@#$%"};
        String illegal = "";
        try{
            for(String s : testValues){
                illegal = s;
                e.setFirstName(s);
            }
        }
        catch(Exception ex){
            fail("Illegal value: " + illegal);
        }
    }
    
    @Test
    public void firstNameLengthShouldBeEven(){
        e.setFirstName("Pete");
        assertTrue(e.isFirstNameEvenLength());
    }
    
    @Test
    public void firstNameLengthFailsIfOdd(){
        e.setFirstName("Bob");
        assertFalse(e.isFirstNameEvenLength());
    }
    
}
