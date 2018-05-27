package PackageTwo;

public class PackageOtherProtection {
    public PackageOtherProtection(){
        PackageOne.Protectionlevel p1p1=new PackageOne.Protectionlevel();
        System.out.println("Protectioin level from other package class instantiation");
        System.out.println("Public number="+p1p1.numberPublic);
        //System.out.println("Private number="+p1p1.numberPrivate);
        //System.out.println("Protected number="+p1p1.numberProtected);
    }
}
