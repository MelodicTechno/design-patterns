import java.time.LocalDate;

public class Main {
    private static CallFactory setUpFactory() {
        CallFactory callFactory;
        FurnitureFactory factory;
        int year = LocalDate.now().getYear();
        if (year > 1800) {
            factory = new ModernFactory();
        }
        else {
            factory = new AncientFactory();
        }
        callFactory = new CallFactory(factory);
        return callFactory;
    }

    public static void main(String[] args) {
        CallFactory callFactory = setUpFactory();
        callFactory.feel();
    }
}
