class arg{
    public static void main(String args[])
    {
        int i,j,sum=0;
        i=Integer.parseInt(args[0]);
        j=Integer.parseInt(args[1]);
        sum=i+j;
        System.out.println("Arguments: "+args[0]);
        System.out.println("sum is= "+sum);
    }
}