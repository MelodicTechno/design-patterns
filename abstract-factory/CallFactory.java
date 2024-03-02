public class CallFactory {
    private final Chair chair;
    private final Table table;
    public CallFactory(FurnitureFactory factory) {
        chair = factory.createChair();
        table = factory.createTable();
    }

    public void feel() {
        chair.sit();
        table.looks();
    }
}