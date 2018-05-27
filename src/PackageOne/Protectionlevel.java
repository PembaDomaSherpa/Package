package PackageOne;

public class Protectionlevel {
    int number=1;
    public int numberPublic=4;
    private int numberPrivate=2;
    protected int numberProtected=3;
    public Protectionlevel(){
        System.out.println("Protection level in same class");
        System.out.println("number="+number);
        System.out.println("Public number ="+numberPublic);
        System.out.println("Private number ="+numberPrivate);
        System.out.println("Protected number ="+numberProtected);
    }
}
