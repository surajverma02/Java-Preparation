package exceptionhandling;
import java.lang.Exception;

class MyException extends Exception{
    MyException(String message){
        super(message);
    }
}

public class MyExceptionTest {
    public static void main(String[] args) {
        int x=5, y=1000;

        try {
            float z = (float)x / (float)y;
            if (z < 0.1){
                throw new MyException("My exception is here");
            }
        }
        catch (MyException e){
            System.out.println("Exception is caught");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Always here for exception handling");
        }
    }
}
