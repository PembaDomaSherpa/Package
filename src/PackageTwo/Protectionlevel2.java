package PackageTwo;

public class Protectionlevel2 extends PackageOne.Protectionlevel {
    public Protectionlevel2(){
        System.out.println("Dericed from other package constructor");
        System.out.println("Public number="+numberPublic);
        System.out.println("Protected number="+numberProtected);

    }
}
