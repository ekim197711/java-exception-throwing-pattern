public class OilException extends Throwable {
    private Oil oil;

    public OilException(Oil oil) {
        super("Oil has been thrown... Watch out its slippery");
        this.oil = oil;
    }

    public Oil getOil() {
        return oil;
    }
}

