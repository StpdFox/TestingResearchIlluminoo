public class EntityManager {
    public EntityManager() {

    }

    public Customer find(Class c,long l){
        Customer customer = new Customer();
        customer.setFirstName("Ted");
        customer.setLastName("Test");
        customer.setId(1);
        return customer;
    };
}
