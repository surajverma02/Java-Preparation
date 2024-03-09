package multithreading;
import java.lang.Thread;

class ThreadA extends Thread{
    public void run(){

        for(int i=1; i<=5; i++){
            if (i==1) {
                // yield();
            }
            System.out.println("\tFrom Thread A : i = " + i);
        }
        System.out.println("Exit from A ");
    }
}

class ThreadB extends Thread{
    public void run(){

        for(int j=1; j<=5; j++){
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

        for(int k=1; k<=5; k++){
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
        A.start();
        System.out.println("Strating Thread B");
        B.start();
        System.out.println("Strating Thread C");
        C.start();
    }
}
