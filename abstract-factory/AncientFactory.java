public class AncientFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new AncientChair();
    }

    @Override
    public Table createTable() {
        return new AncientTable();
    }
}
