public class ClientTest {
    public static void main(String[] args) {
        Customer customer = new BusinessAnalyst(new Developer());
        customer.sendRequest("i want to WFH");
    }
}
