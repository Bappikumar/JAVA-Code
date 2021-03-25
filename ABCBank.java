interface AccountFactory
    {  
    float getInterest(); 
    String showInfo()
    {
        account_name();
        account_number();
        balance();
    }

    class SavingsAccount implements AccountFactory
    {  
    public String showInfo()
        
    {
        
    }
    public float rateOfInterest()
      {
        return 4.5f;
      }  
    }  
    class CurrentAccount implements AccountFactory
    {  
    public float rateOfInterest()
      {
        return 3.5f;}  
      }  
    }
    class FixedAccount implements AccountFactory
    {  
    public float rateOfInterest()
      {
        return 7.5f;
      }  
    }  
    class ABCBank
    {  
    public static void main(String[] args)
    {  
    AccountFactory b=new AccountFactory();  
    System.out.println("ROI: "+b.rateOfInterest());  
    }
} 
