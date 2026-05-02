package OOPS;

import java.util.Scanner;

class TravelAgenncies1{
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacilty;

    TravelAgenncies1(int regNo,String agencyName,String packageType,int price,boolean flightFacilty){ 
        this.regNo=regNo;
        this.agencyName=agencyName;
        this.packageType=packageType;
        this.price=price;
        this.flightFacilty=flightFacilty;
    }

    public int getregNo() {
        return regNo;
    }

    public String getagencyName() {
        return agencyName;
    }

    public String getpackageType() {
        return packageType;
    }

    public int getprice() {
        return price;
    }

    public boolean isflightFacilty() {
        return flightFacilty;
    }
}

class Solutions
{
    static int findAgencyWithHighestPackagePrice(TravelAgenncies1 arr[]){
        int max = arr[0].getprice();
        for(TravelAgenncies1 agency : arr)
        {
            if(agency.getprice() > max)
            {
                max = agency.getprice();
            }
        }
        return max;
    }

    
    static TravelAgenncies1 agencyDetailsForGivenldAndType(TravelAgenncies1 arr[],int regNo,String packageType)
    {
        for(TravelAgenncies1 agency : arr){
            if(agency.isflightFacilty() && agency.getregNo()==regNo && agency.getpackageType().equalsIgnoreCase(packageType))
            {
                return agency;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        TravelAgenncies1 arr[] = new TravelAgenncies1[n];

        for(int i=0;i<n;i++)
        {
            int regNo = sc.nextInt();
            String agencyName = sc.nextLine();
            sc.nextLine();
            String packageType = sc.nextLine();
            sc.hasNextLine();
            int price = sc.nextInt();
            boolean flightFacilty = sc.nextBoolean();

            arr[i] = new TravelAgenncies1(regNo,agencyName,packageType,price,flightFacilty);
        }

        int regNo = sc.nextInt();
        String packageType = sc.next();
        
        int highestprice = findAgencyWithHighestPackagePrice(arr);
        TravelAgenncies1 result = agencyDetailsForGivenldAndType(arr,regNo,packageType);

        System.out.println(highestprice);

        if(result != null)
        {
            System.out.println(result.getagencyName()+":"+result.getprice());
        }
        else
        {
            System.out.println("No Agency Found");
        }

        sc.close(); 
    }
}