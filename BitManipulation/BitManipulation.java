package bitmanipulation;

public class BitManipulation {
    public static void main(String[] args) {
        int number = 5;
        int index = 0;

        // int result = getBit(number, index);
        int result = resetBit(number, index);
        System.out.println("Bit is " + result);

    }

    public static int getBit(int n, int i){
        int bitMask = 1<<i;

        if((bitMask & n )== 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setBit(int n, int i){
        int bitMask = 1<<i;

        return bitMask|n;
    }

    public static int resetBit(int n, int i){
        int bitMask = ~(1<<i);
        return (bitMask & n);
    }
}
