import java.util.Scanner;

public abstract class Expense {
    public float realMonthlyExpense;
    protected float managerExpense;

    public Expense(float realMonthlyExpense, float managerExpense) {
        this.realMonthlyExpense = realMonthlyExpense;
        this.managerExpense = managerExpense;
    }

    public Expense() {

    }

    public float getRealMonthlyExpense() {
        return realMonthlyExpense;
    }

    public void setRealMonthlyExpense(float realMonthlyExpense) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter monthly expense");
        realMonthlyExpense=sc.nextInt();
        this.realMonthlyExpense = realMonthlyExpense;
    }

    public float getManagerExpense() {
        return managerExpense;
    }

    public void setManagerExpense(float managerExpense) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter manager's expense");
        managerExpense=sc.nextInt();
        this.managerExpense = managerExpense;
    }

    public abstract void distributeIncome();//abstact method


    public void purchaseClothes(){
        System.out.println("the money is expensed on clothes");
    }//polymorphism
}
