import org.junit.Test;

import static org.junit.Assert.*;

public class AccountAssertionsTest {
    @Test
    public void AccountAssertionsTest() {
 
        Account account_one = new Account(200, "John Doe");
        Account account_two = new Account(200, "Tom Smith");
        Account account_three = new Account(100, "John Doe");
        Account account_four = null;
        Account account_five = account_one;
        Account[] allAccounts_one = { account_one, account_two, account_three };
        Account[] allAccounts_two = { account_one, account_two, account_three };
 
        // assertTrue checking if a condition is true
        assertTrue(account_one.getBalance() == account_two.getBalance());
 
        // assertFalse checking if a condition is true
        assertFalse(account_one.getBalance() == account_three.getBalance());
 
        // assertFalse checking if a condition is false
        assertFalse(account_one.getBalance() == account_three.getBalance());
 
        // assertNull checking if an object is null
        assertNull(account_four);   
 
        // assertNotNull checking if an object is not null
        assertNotNull(account_three);
 
        // assertEquals checking if two objects are equal
        assertEquals(account_one.getName(), account_three.getName());
 
        // assertSame checking if two objects references point the same object
        assertSame(account_one, account_five);
 
        // assertNotSame checking if two objects references don't point the same object
        assertNotSame(account_one, account_four);
 
        // assertArrayEquals checking if two arrays are the equal
        assertArrayEquals(allAccounts_one, allAccounts_two);
    }
}
