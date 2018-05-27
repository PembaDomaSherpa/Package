package Exception;

public class ThrowDemo {
    public static void main(String[] args) {
        try{
            char array[]={'P','e','m','b','a'};
            System.out.println(array[44]);
        }
        catch(Exception e){
            System.out.println("The excepton is "+e);
        }
    }
}
