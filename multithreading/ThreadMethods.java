package multithreading;
import java.lang.Thread;

class ThreadA extends Thread{
    public void run(){

        System.out.println(Thread.currentThread());
        System.out.println("HI");
    }
}

class ThreadB extends Thread{
    public void run(){

        for(int j=1; j<=3; j++){
            System.out.println("\tFrom Thread B : j = " + j);
            if(j==3){
                // stop();
            }
        }
        System.out.println("Exit from B ");
    }
}

class ThreadC extends Thread{
    public void run(){

        for(int k=1; k<=3; k++){
            System.out.println("\tFrom Thread C : k = " + k);
            if (k==2) {
                try{
                    sleep(10000);
                }
                catch(Exception e){

                }
                
            }
        }
        System.out.println("Exit from C ");
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        
        ThreadA A = new ThreadA();
        ThreadB B = new ThreadB();
        ThreadC C = new ThreadC();

        System.out.println("Strating Thread A");
        System.out.println(A.getState());
        A.start();
        System.out.println(A.getState());
        System.out.println("Strating Thread B");
        System.out.println(B.getState());
        B.start();
        System.out.println(B.getState());
        System.out.println("Strating Thread C");
        System.out.println(C.getState());
        C.start();
        System.out.println(C.getState());
        System.out.println(Thread.currentThread());
    }
}
