public class BusinessAnalyst implements Customer {
    private Developer developer;

    public BusinessAnalyst(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void sendRequest(String request) {
        System.out.println("Reading request.....");
        System.out.println(request);
        String information = this.translate(request);
        System.out.println("sending information...");
        developer.receive(information);
    }

    private String translate(String request){
        return "Create Zoom";
    }

}
