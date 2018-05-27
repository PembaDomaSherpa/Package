package Exception.OwnException;

public class EmployeeTest {
    static void employeeAge(int age) throws MyOwnException{
        if(age<0)
            throw new MyOwnException("Age cannot be less than zero.");
        else
            System.out.println("Input is valid!!");
    }

    public static void main(String[] args) {
        try{
            employeeAge(0);
        }
        catch(MyOwnException e){
            e.printStackTrace();
        }
    }
}
