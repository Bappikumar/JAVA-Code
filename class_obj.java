class class_obj
{
    int fac_id;
    String fac_name;
    
    void Display()
    {
        System.out.println("Faculty id: "+fac_id);
        System.out.println("faculty name: "+fac_name);
    }
    public static void main(String []a)
     {
       class_obj f1=new class_obj();
       f1.fac_id=1;
       f1.fac_name="CSE";
       class_obj f2=new class_obj();
       f2.fac_id=2;
       f2.fac_name="programming";
       f1.Display();
       f2.Display();  
    }
}