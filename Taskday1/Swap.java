public class Swap{
    public static void main(String[] args){
    
    int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]);
    
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println(" after swap the value of a is" +a);
    System.out.println(" after swap the value of b is" +b);
    }
    }
    