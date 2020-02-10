public class BananaException extends Throwable {
    private Banana banana;

    public BananaException(Banana banana) {
        super("A banana has been thrown");
        this.banana = banana;
    }

    public Banana getBanana() {
        return banana;
    }
}
