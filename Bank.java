class AccountFactory
{
    void showInfo();
    void getInterest();
}

void showInfo()
{
    String account_name ();
    float account_number ();
    double balance();

}

void getInterest()
{
    return getInterest();
}

class SavingsAccount extends AccountFactory()
{
    show info(String A, Float 101, double 10000)
    {
        System.out.println("Name:  ",+account_name);
        System.out.println("id:  ",+account_number);
        System.out.println("balance:  ",+balance);
    }

    getInterest()
    {
        balance=10000+10000*0.045;
        System.out.println("balance:  ",+balance);
    }
    
}

class CurrentAccount extends AccountFactory()
{
    show info(String B, Float 102, double 20000)
    {
        System.out.println("Name:  ",+account_name);
        System.out.println("id:  ",+account_number);
        System.out.println("balance:  ",+balance);
    }

    getInterest()
    {
        balance=20000+20000*0.035;
        System.out.println("balance:  ",+balance);
    }
    
}

class FixedDepositAccount extends AccountFactory()
{
    show info(String c, Float 103, double 30000)
    {
        System.out.println("Name:  ",+account_name);
        System.out.println("id:  ",+account_number);
        System.out.println("balance:  ",+balance);
    }

    getInterest()
    {
        balance=30000+30000*0.045;
        System.out.println("balance:  ",+balance);
    }
    
}

class Bank
{
    public static void 
}