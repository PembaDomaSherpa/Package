package Exception;

public class StackUnwinding {
    public static void main(String[] args) {
        try{
            throwException();
        }
        catch(Exception ex){
            System.err.println("Exception handled in main");
        }
    }
    public static void throwException()throws Exception{
        try{
            System.out.println("Method throw exception");
        }
        catch(RuntimeException e){
            System.err.println("Exception handled in method throwException");
        }
        finally{
            System.err.println("Finally is always executed.");
        }
    }
}
