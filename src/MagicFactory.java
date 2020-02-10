public class MagicFactory {

    public void produceSomething(String match) throws BananaException, OilException, TomatoeException {
        if ("monkey".equalsIgnoreCase(match))
            throw new BananaException(new Banana(100));
        if ("car".equalsIgnoreCase(match))
            throw new OilException(new Oil(80));

        throw new TomatoeException(new Tomatoe(90));
    }

}
