import org.w3c.dom.events.EventException;

class customTRYCATCH {
    public  static void main(String[] args)
    {
        try{
            int a=10;
            int b=0;
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
    }
    finally
    {
        System.out.println("i will work evertime");
    }
    System.out.println("_____");
}
}