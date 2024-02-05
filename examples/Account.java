class Account 
{
    int id;
    String name;
    float amount;

    void insert(int a, String n, float amt)
    {
        id=a;
        name=n;
        amount=amt;
    }

    void deposit(float amt)
    {
        amount=amount+amt;
        System.out.println(amt+ "deposit");
    }

    void withdraw(float amt)
    {
        if(amount<amt)
        {
            System.out.println("Insufficiant ballance");
        }
        else
        {
            amount=amount-amt;
            System.out.println(amt+ "withdrawn");
        }
    }
        void balance()
        {
            System.out.println("balance is:" +amount);
        }

        void display()
        {
            System.out.println(id+ "" +name+ "" +amount);   
        }
}
        class TestAccount
        {
            public static void main(String args[]) 
            {
                Account a = new Account();
                a.insert(1000, "vivek", 1000);
                a.display();
                a.balance();
                a.withdraw(500);
                a.balance();
                a.deposit(2000);
                a.balance();
            }
        }



