public class Program1 extends Thread{
    String s;
    Program1(String s)
    {
        this.s = s;
    }
    public void run()
    {
        System.out.println(s);
    }
    public static void main(String[] args) {
        Program1 obj1 = new Program1("Hello");
        Program1 obj2 = new Program1("Hii");
        obj1.start();
        obj2.start();


    }

}
