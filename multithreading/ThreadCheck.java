/*
 *There are three thread
 *extending Thread class
 *All are override the run()
 *objects is created and thread is initiates
 *start() call the run() 
 *all the thread code are running simultaneously
*/

package multithreading;

// for using thread methods
import java.lang.Thread;

class ThreadA extends Thread{

    // overriding the run()
    public void run(){

        for(int i=1; i<=5; i++){
            System.out.println("\tFrom Thread A : i = " + i);
        }
        System.out.println("Exit from A ");
    }
}

class ThreadB extends Thread{

    // overriding the run()
    public void run(){

        for(int j=1; j<=5; j++){
            System.out.println("\tFrom Thread B : j = " + j);
        }
        System.out.println("Exit from B ");
    }
}

class ThreadC extends Thread{

    // overriding the run()
    public void run(){

        for(int k=1; k<=5; k++){
            System.out.println("\tFrom Thread C : k = " + k);
        }
        System.out.println("Exit from C ");
    }
}

public class ThreadCheck {
    public static void main(String[] args) {

        // making thread objects
        ThreadA A = new ThreadA();
        ThreadB B = new ThreadB();
        ThreadC C = new ThreadC();

        // starting thread using the objects, start() method is call the run() method
        A.start();
        B.start();
        C.start();

        // new ThreadA().start();
        // new ThreadB().start();
        // new ThreadC().start();
        // Here, new ThreadA() creates a object and .start() method initiates the thread
    }
}
