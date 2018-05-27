package Exception;

public class ExceptionMethod {
    public static void main(String[] args) {
        try{
            Method1();
        }
        catch(Exception exception){
            System.err.println("%s"+exception.getMessage());
            exception.printStackTrace();
            StackTraceElement[] traceElements=exception.getStackTrace();
            System.out.println("\nStack trace from getStackTree: ");
            System.out.println("Class\t\t\t\t\t\tFile\t\t\t\t\tLine\t\t\tMethod");
            System.out.println("*****\t\t\t\t\t\t****\t\t\t\t\t****\t\t\t******");
            for(StackTraceElement element:traceElements){
                System.out.printf("%s\t" , element.getClassName());
                System.out.printf("%s\t" , element.getFileName());
                System.out.printf("%s\t" , element.getLineNumber());
                System.out.printf("%s\n" , element.getMethodName());
            }
        }
    }
    public static void Method1() throws Exception{
        Method2();
    }
    public static void Method2()throws Exception{
        Method3();
    }
    public static void Method3() throws Exception{
        throw new Exception("Exception thrown in method3");
    }
}
