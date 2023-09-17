public class ClientTest {
    public static void main(String[] args) {
        EagerInitialization eagerInitialization = EagerInitialization.getInstance();
        eagerInitialization.setName("nguyen anh ky");
        System.out.println(eagerInitialization);

        EagerInitialization eagerInitialization1= EagerInitialization.getInstance();
        System.out.println(eagerInitialization1.getName());
        System.out.println(eagerInitialization1);

    }
}
