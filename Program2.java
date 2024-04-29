public class Program2 implements Runnable {
    String s;
    Program2(String s)
    {
        this.s = s;
    }
    public void run()
    {
        System.out.println(s);
    }
    public static void main(String[] args) {
        Program2 obj1 = new Program2("Hello");
        Program2 obj2 = new Program2("Hii");
        obj1.run();
        obj2.run();




        
    }
}
