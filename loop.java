class loop
{
    public static void main(String []a)
     {
         outer: for(int i=0;i<3;i++)
         {
          for(int j=0;j<3;j++)
             {
                 inner:for(int k=0;k<3;k++){
                 System.out.println("Bangladesh"+k);
                 break outer;
                 }
                 
             }
             System.out.println("in loop i");
             System.out.println("Bappi kumar"+i);
             
         }
     }
}