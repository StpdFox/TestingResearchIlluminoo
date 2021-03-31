import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerReaderTest {

    @Test
    public void CompareNameTest(){
        Customer sampleCustomer = new Customer();
        sampleCustomer.setFirstName("Matthijs");
        sampleCustomer.setLastName("Vos");

        EntityManager entityManager = mock(EntityManager.class);
        when(entityManager.find(Customer.class,1L)).thenReturn(sampleCustomer);

        CustomerReader customerReader = new CustomerReader();
        customerReader.setEntityManager(entityManager);

        String fullName = customerReader.findFullName(1L);
        String name = "Matthijs Vos";
        Assert.assertEquals(name,fullName);
    }
}