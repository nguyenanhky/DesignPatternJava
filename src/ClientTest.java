public class ClientTest {
    public static void main(String[] args) {
        AnimalFactory factory = new DogFactory();

        Dog dog = (Dog)factory.createAnimal();
        dog.Speak();
        dog.show();


    }
}
