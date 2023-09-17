public class ClientTest {
    public static void main(String[] args) {
        // create instance of House
        House house = new HouseBuilder()
                .buildWalls(4)
                .buildDoor(2)
                .buildColor("Red")
                .buildRoof(true)
                .build();

        System.out.println(house);

    }
}
