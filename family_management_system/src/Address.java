import java.util.*;
public class Address {
    public String country;
    public String region;
    public String city;
    public int kebele;
    public int houseNumber;

    public Address(String country, String region, String city, int kebele, int houseNumber) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.kebele = kebele;
        this.houseNumber = houseNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your country");
        country = sc.nextLine();
        this.country = country;

    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your region");
        region=sc.nextLine();
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your city");
        city=sc.nextLine();
        this.city = city;
    }

    public int getKebele() {
        return kebele;
    }

    public void setKebele(int kebele) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your kebele");
        kebele=sc.nextInt();
        this.kebele = kebele;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNO(int houseNumber) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your house number");
        houseNumber=sc.nextInt();
        this.houseNumber= houseNumber;
    }

    public void getLocation(){
        System.out.println("location"+"\n"+country+"\n"+","+region+"\n"+","+city+"\n"+","+kebele+"\n"+","+houseNumber);
    }



}
