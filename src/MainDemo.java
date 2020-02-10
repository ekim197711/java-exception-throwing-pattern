public class MainDemo {

    public static void main(String[] args) {
        try {
            new MagicFactory().produceSomething("bird");
        } catch (BananaException e) {
            e.printStackTrace();
            System.out.println("Yum yum im eating a banana: " + e.getBanana());
        } catch (OilException e) {
            e.printStackTrace();
            System.out.println("Watch out theres oil: " + e.getOil());
        } catch (TomatoeException e) {
            System.out.println("Watch out for the tomatoe: " + e.getTomatoe());
        }
    }
}
