package Exception.UserDefinedException;

public class CustomException {
    public static void main(String[] args) {
        try{
            throw new MyExceptionMain("Custom");
        }
        catch(MyExceptionMain exp){
            System.out.println("Hello, This is my catch block");
            System.out.println(exp);
        }
    }
}
