public class ClientTest {
    public static void main(String[] args) {
        Candy hardCandy = CandyFactory.getCandy(CandyType.HARD);
        System.out.println(hardCandy.getCandyName());
        System.out.println("=====================");

        Candy mintyCandy = CandyFactory.getCandy(CandyType.MINTY);
        System.out.println(mintyCandy.getCandyName());

        HardCandy hardCandy1 = (HardCandy) CandyFactory.getCandy(CandyType.HARD);
        hardCandy1.show();
    }

}

