import java.io.*;
public class Even1{
public static void main(String a[]){
 BufferedReader d= new BufferedReader(new InputStreamReader(System.in));
 try{int n= Integer.parseInt(d.readLine());
 if (n%2==0)
  System.out.println("even");
else 
System.out.println("odd");
}
catch(Exception e)
{
System.out.println("error");}
}

}