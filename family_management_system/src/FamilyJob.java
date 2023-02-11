import java.util.*;
public class FamilyJob {
    private String jobOfFather;
    private String jobOfMother;
    private String jobOfChild;
//apply encapsulation as the


    public void setJobOfFather(String jobOfFather) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your fathers job");
        jobOfFather=sc.nextLine();
        this.jobOfFather = jobOfFather;
    }

    public void setJobOfMother(String jobOfMother) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your mothers job");
        jobOfMother=sc.nextLine();

        this.jobOfMother = jobOfMother;
    }

    public void setJobOfChild(String jobOfChild) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your child's job");
        jobOfChild=sc.nextLine();
        this.jobOfChild = jobOfChild;
    }

    public String getJobOfFather() {
        return jobOfFather;
    }

    public String getJobOfMother() {

        return jobOfMother;
    }

    public String getJobOfChild() {

        return jobOfChild;
    }
}
