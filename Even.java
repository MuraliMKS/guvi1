import .java.io.*;
public class Even{
public Static void  main(String a[]){
 BufferedReader d= new BufferedReader(new InputStreamReader(System.in()));
 int n= Integer.parseInt(d.readLine());
 if (n%2==0)
  System.out.println("even");
else 
System.out.println("odd");
}

}