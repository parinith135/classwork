/*Print only odd numbers betweeen 1-100*/
class Example2{
 public static void main(String args[])
 {
  int n;
  for(n=0;n<100;n++)
  {
   if((n % 2)!=0)
   System.out.println(n);
  }
 }
}