import java.util.*;
public class Main {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("Welcome to Family Mangement System");
        System.out.println("=================================================");
        System.out.println("Please press 0 to start the process and press -1 to exit");
         int x = sc.nextInt();
                                         System.out.println("press 1 to access FAMILY CLASS");
                                         System.out.println("press 2 to access ADDRESS CLASS");
                                         System.out.println("press 3 to access FAMILY JOB CLASS");
                                         System.out.println("press 4 to access INCOME CLASS");
                                         System.out.println("press 5 to access MANAGEMENT CLASS");
                                         System.out.println("press 6 to access SAVED AMOUNT CLASS");
                                         System.out.println("press 7 to access PAYMENT CLASS");
                                         System.out.println("press 8 to access FOOD CLASS");
                                         System.out.println("press 9 to access CLOTHES CLASS");
                                         System.out.println("press 10 to access HOUSE CLASS");
                                         System.out.println("press 11 to access EXPENSE FOR CLOTH");
        while (x==0)
        {
           int y;


            System.out.println("enter your choice");
            y=sc.nextInt();
            switch (y) {
               //this section shows the family's name
                case 1:
                Family fam = new Family("kebede's family", 12341234, "wolaita", 12);
                fam.setFamName("abera's family");
                fam.setFamSize(4);
                fam.setFamPhoneNumber(259825524);
                fam.setTribe("amara");
                System.out.println("family name is:" + fam.getFamName() + "\n" + "family size is" + fam.getFamSize() + "\n" + "family phone" +
                        "is" + fam.getFamPhoneNumber() + "\n" + "family tribe is: " + fam.getTribe());
                    System.out.println("\n");
                    break;

                //this section inserts the family's address
                case 2:
                Address add = new Address("ETHIOPIA", "AMHARA", "BAHIRDAR", 16, 1234);
                add.setCountry("ETHIOPIA");
                add.setRegion("OROMIA");
                add.setCity("JIMMA");
                add.setKebele(013);
                add.setHouseNO(432);
                System.out.println("country is:" + add.getCountry() + "\n" + "region is" + add.getRegion() + "\n" + "city" +
                        "is" + add.getCity() + "\n" + "kebele is: " + add.getKebele()+"\n" + "house no is" + add.getHouseNumber());

                    add.getLocation();
                    System.out.println("\n");
                    break;

                //encapsulation    class family job
                case 3:
                FamilyJob job = new FamilyJob();
                job.setJobOfFather("Medical doctor");
                job.setJobOfMother("commander");
                job.setJobOfChild("student");
                System.out.println("father's job is:" + job.getJobOfFather() + "\n" + "mother's job is: " + job.getJobOfMother() +
                        "\n" + "child's job is: " + job.getJobOfChild());
                    System.out.println("\n");
                    break;

                //encapsulation class income
                case 4:
                Income inc = new Income();
                inc.setMotherIncome(0);
                inc.setFatherIncome(0);
                inc.setChildIncome(0);
                inc.setOtherIncome(0);

                System.out.println("father's income is:-" + inc.getFatherIncome() + "\n" + "mother's income is:-"
                        + inc.getMotherIncome() + "\n" + "child's income is: " + inc.getChildIncome()+"\n"+
                        "other income is: " + inc.getOtherIncome());
                    inc.calcTotalIncome(inc.getFatherIncome(), inc.getMotherIncome(), inc.getChildIncome(), inc.getOtherIncome());
                    System.out.println("check the family status ");
                    inc.checkFamilyStatus(6789);
                    System.out.println("\n");
                    break;

// interface realization:
                case 5:
                Management mt = new Management("managing expense and income", 15000,"abebe","medical doctor");
                mt.setTask("managing");
                mt.setTotalMonthlyExpense(10000);
                mt.setManagerName("kebede");
                mt.setManagerJob("medical doctor");
                System.out.println("the manager's task is:" + mt.getTask() + "total income is: " + mt.getTotalMonthlyExpense()+
                        "the manager's name is:" + mt.getManagerName()+"the manager's job is:" + mt.getManagerJob());
                mt.manageExpense();
                mt.moneyInquiry();
                mt.manageIncome();
                    System.out.println("\n");
                    break;

                //comment
                case 6:
                SavedAmount sa = new SavedAmount(1000);
                sa.setHarvestAmount(1300);
                System.out.println("the amount remaining is: " + sa.getHarvestAmount());
                    System.out.println("\n");
                    break;

                // class payment inherits methods from class Expense
                case 7:
                Payment py = new Payment(100, 50, 150, 150);
                py.setAmountOfChildSchool(150);
                py.setAmountOfHouseRent(200);
                py.setBillOfElectricity(250);
                py.setBillOfWater(300);
                System.out.println("bill of water is:-" + py.getBillOfWater() + "\n" + "bill of electricity is:-" + py.getBillOfElectricity() + "\n" +
                        "amount of child school is:-" + py.getAmountOfChildSchool() + "\n" + "amount of house rent is:-" + py.getAmountOfHouseRent());
                   py.calcTotalBill(py.getBillOfWater(),py.getBillOfElectricity());
                   py.calcTotalAmount(py.getAmountOfChildSchool(),py.getAmountOfHouseRent());
                   py.distributeIncome();
                    System.out.println("\n");
                    break;

                    //inherits abstract methods in class Need
                case 8:
                Food fd = new Food("tomatoes", 100, "vitamin", "vegetables");
                fd.setName("mangoes");
                fd.setExpense(150);
                fd.setNutrient("vitamin");
                fd.setType("fruit");
                System.out.println("the name of the food is:-" + fd.getName() + "\n" + "the expense for the food is:-" + fd.getExpense() + "\n" +
                        "the nutrient of the food is :-" + fd.getNutrient() + "\n" + "the type of food is:-" + fd.getType());
                fd.distributeIncome();
                fd.prepareVacation();
                fd.getBalancedDiet();
                    System.out.println("\n");
                    break;

                // inherits abstract methods in class Need
                case 9:
                Clothes cts = new Clothes(2, 1000, "nike", 100);
                cts.setNumOfClothes(3);
                cts.setExpense(1500);
                cts.setBrand("turkish");
                cts.setPriceOfShoes(0);

                System.out.println("the number of clothes is:-" + cts.getNumOfClothes() + "\n" + "the expense for the clothes is:-" + cts.getExpense() + "\n" +
                        "the brand's type is :-" + cts.getBrand() + "\n" + "the price of shoes is:-" + cts.getPriceOfShoes());
                cts.purchaseClothes();
                cts.checkBrand("adidas");
                cts.purchaseNumOfShoes(0);
                cts.prepareVacation();
                cts.getBalancedDiet();
                    System.out.println("\n");
                    break;

                // inherits abstract methods in class Need
                case 10:
                House hs = new House(1, "public");
                hs.setHouseNo(2);
                hs.setTypeOfHouse("private");
                System.out.println("your house no is" + hs.getHouseNo() + "\n" + "the type of the house is" + hs.typeOfHouse);
                hs.payHouseBill();
                hs.isHouse(0);
                hs.prepareVacation();
                hs.getBalancedDiet();
                System.out.println("\n");
                break;

                case 11:
                    //this applies polymorphism
                Expense e1, e2, e3;
                e1 = new Expense() {
                    @Override
                    public void distributeIncome() {

                    }
                };
                e2 = new Need() {
                    @Override
                    public void prepareVacation() {

                    }

                    @Override
                    public void getBalancedDiet() {

                    }
                };
                e3 = new Clothes(1, 300, "nike", 1);
                e1.purchaseClothes();
                e2.purchaseClothes();
                e3.purchaseClothes();
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("sorry please enter a valid number");
            }
            System.out.println("enter 0 to repeat and enter -1 to exit");
             x = sc.nextInt();
        }
    }
}