class SyncDemo {
    static synchronized void multiply(int x) {
        for (int i = 1; i < 13; i++) {
            System.out.println(x + " * " + i + " = " + i * x);
        }
    }
}

public class Program3 {
    public static void main(String[] args) {
        A a = new A(2);
        B b = new B(3);
        a.start();
        b.start();
    }
}

class A extends Thread {
    int x;

    A(int x) {
        this.x = x;
    }

    public void run() {
        SyncDemo.multiply(x);
    }
}

class B extends Thread {
    int y;

    B(int y) {
        this.y = y;
    }

    public void run() {
        SyncDemo.multiply(y);
    }
}
