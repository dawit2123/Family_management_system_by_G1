import java.util.Scanner;

public class Food extends Need{
    public String name;
    public float expense ;
    public String nutrient;
    public String type;

    public Food(String name, float expense, String nutrient, String type) {
        super();
        this.name = name;
        this.expense = expense;
        this.nutrient = nutrient;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name of food");
        name=sc.nextLine();
        this.name = name;
    }

    public float getExpense() {
        return expense;
    }

    public void setExpense(float expense) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the expense");
        expense=sc.nextFloat();
        this.expense = expense;
    }

    public String getNutrient() {
        return nutrient; }

    public void setNutrient(String nutrient) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nutrients");
        nutrient=sc.nextLine();
        this.nutrient = nutrient;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the food type");
        type=sc.nextLine();
        this.type = type;
    }

    public void distributeIncome(){

        System.out.println("here the income is distributed for "+expense);
    }
    public void prepareVacation(){
        System.out.println("this month the family has a vacation ");
    }
    public void getBalancedDiet(){
        System.out.println("the family should get balanced diet by eating different kinds of food");
    }
}
