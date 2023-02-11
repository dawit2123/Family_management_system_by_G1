import java.util.Scanner;

public class Management implements Manager{
    private String task;
    private float totalMonthlyExpense;
    public String managerName = "Abera";
    public String managerJob="medical doctor";


    public Management(String task, float totalMonthlyExpense, String managerName, String managerJob) {
        this.task = task;
        this.totalMonthlyExpense = totalMonthlyExpense;
        this.managerName = managerName;
        this.managerJob = managerJob;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter manager's task ");
        task=sc.nextLine();
        this.task = task;
    }

    public float getTotalMonthlyExpense() {
        return totalMonthlyExpense;
    }

    public void setTotalMonthlyExpense(float totalMonthlyExpense) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter expeted total monthly expense");
        totalMonthlyExpense=sc.nextFloat();
        this.totalMonthlyExpense = totalMonthlyExpense;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter manager's name");
        managerName=sc.nextLine();
        this.managerName = managerName;
    }

    public String getManagerJob() {
        return managerJob;
    }

    public void setManagerJob(String managerJob) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter manager's job");
        managerJob=sc.nextLine();
        this.managerJob = managerJob;
    }

    public void manageExpense(){
        System.out.println("the income is properly expensed for needs and payments");
    }
    public void manageIncome(){

        System.out.println("Total income is managed by manager");
    }
   public void moneyInquiry(){
        System.out.println("the manager is asked to lend money");
    }

}
