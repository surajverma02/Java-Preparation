package exceptionhandling;

public class ExceptionTest {
    public static void main(String[] args) {

        String[] str = {"s", "s", "2", "2", "3", "4", "5"};
        int invalid = 0;
        int count=0, number =0;

        for(int i=0; i< str.length; i++){
            try {
                number = Integer.parseInt(str[i]);
                System.out.println("Number is: " + number);
            }catch (Exception e){
                invalid += 1;
                System.out.println("Invalid number: " + str[i]);
                continue;
            }
            count += 1;
        }

        System.out.println("Valid Number = " + count);
        System.out.println("InValid Number = " + invalid);
    }
}
