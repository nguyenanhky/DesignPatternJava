public class EagerInitialization {
    private static EagerInitialization INSTANCE;

    private EagerInitialization() {
        // no create instance outside class
    }

    public static EagerInitialization getInstance(){
        if(INSTANCE==null){
            INSTANCE = new EagerInitialization();
        }
        return INSTANCE;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
