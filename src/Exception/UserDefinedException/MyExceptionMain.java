package Exception.UserDefinedException;

public class MyExceptionMain extends Exception {
    String str1;
    MyExceptionMain(String str2){

        str1=str2;
    }
    public String toString(){

        return ("Output String = "+str1);
    }
}
