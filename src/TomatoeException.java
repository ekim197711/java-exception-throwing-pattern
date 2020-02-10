public class TomatoeException extends Throwable {
    private Tomatoe tomatoe;

    public TomatoeException(Tomatoe tomatoe) {
        super("A Tomatoe has been thrown... Watch out");
        this.tomatoe = tomatoe;
    }

    public Tomatoe getTomatoe() {
        return tomatoe;
    }
}
