import java.io.*;
public class Max {
    public static void main(String[] args) {
        BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
        try{
        int n=Integer.parseInt(d.readLine());
        if(n>0)
            System.out.println("positive");
        else if( n < 0)
            System.out.println("negative");
        else 
            System.out.println("Zero");
        }
        catch(Exception e)
        {System.out.println("exception");
            
        }
    }
    
}