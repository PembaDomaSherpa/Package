package PackageOne;

public class PackageSameAccess {
    public PackageSameAccess(){
        Protectionlevel p1= new Protectionlevel();
        System.out.println("Protection level at same package:private doesnt work");
        System.out.println("number="+p1.number);
        System.out.println("Public number ="+p1.numberPublic);
        //System.out.println("Private number ="+p1.numberPrivate);
        System.out.println("Protected number ="+p1.numberProtected);
    }
}
