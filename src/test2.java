class Mythread extends Thread
{
    public void run()
    {
        int i;
        for (i=0; i<5; i++)
        {
            System.out.println("Mythread");
        }
    }
}
class test2 {
    public static void main(String[] args) {
        Mythread obj=new Mythread();
        obj.start();
    }
}
