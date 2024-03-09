package multithreading;
import java.lang.Thread;

class ThreadTestA extends Thread{
    public void run(){
        System.out.println(Thread.currentThread());
        System.out.println("Hi");
    }
}

class ThreadTestB extends Thread{
    public void run(){

        for(int j=1; j<=3; j++){
            System.out.println("\tFrom Thread B : j = " + j);
        }
        System.out.println("Exit from B ");
    }
}

class ThreadTestC extends Thread{
    public void run(){

        for(int k=1; k<=3; k++){
            System.out.println("\tFrom Thread C : k = " + k);
            if (k==2) {
                try{
                    sleep(10000);
                }
                catch(Exception e){
                    System.out.println("Exception occurred");
                }
                
            }
        }
        System.out.println("Exit from C ");
    }
}

public class ThreadMethods {
    public static void main(String[] args) {

        ThreadTestA A = new ThreadTestA();
        ThreadTestB B = new ThreadTestB();
        ThreadTestC C = new ThreadTestC();

        System.out.println("Starting Thread A");
        System.out.println(A.getState());
        A.start();
        System.out.println(A.getState());
        System.out.println("Starting Thread B");
        System.out.println(B.getState());
        B.start();
        System.out.println(B.getState());
        System.out.println("Starting Thread C");
        System.out.println(C.getState());
        C.start();
        System.out.println(C.getState());
        System.out.println(Thread.currentThread());
    }
}
