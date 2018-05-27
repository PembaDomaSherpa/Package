package PackageOne;

public class DerivedP extends Protectionlevel{
    DerivedP(){
        System.out.println("Construtor deriveed from protectionlevel: private doesbt work");
        System.out.println("number="+number);
        System.out.println("Public number ="+numberPublic);
        //System.out.println("Private number ="+numberPrivate);
        System.out.println("Protected number ="+numberProtected);
    }
}
