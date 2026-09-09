import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RealEstatePropertyArrayDriver{
    //overallAvg
    public static int overallAvg(RealEstateProperty[] a){
        int sum=0;
        int count=0;
        for (RealEstateProperty property:a){
            if(property !=null){
                sum+=property.getBedRooms();
                count++;
            }
        }
        return count==0?0:sum/count;
    }
    //count
    public static int count(RealEstateProperty [] a, RealEstateProperty o){
        int count=0;
        for(RealEstateProperty property:a){
            if(property!=null && property.equals(o)){
                count++;
            }
        }
        return count;
    }
    
    //groupAvg
    public static int groupAvg(RealEstateProperty[]a, String s){
        int sum=0;
        int count=0;

        for(RealEstateProperty property:a){
            if(property!=null&&property.getPropertyType().equalsIgnoreCase(s)){
                sum+=property.getBedRooms();
                count++;
            }
        }
        return count==0?0:sum/count;
    }

    //less Than
    public static RealEstateProperty[] lessThan(RealEstateProperty[] a, Integer i) {
        int matchCount = 0;
        for (RealEstateProperty property : a) {
            if (property != null && property.getBedRooms() < i) {
                matchCount++;
            }
        }

        RealEstateProperty[] result = new RealEstateProperty[matchCount];
        int index = 0;

        for (RealEstateProperty property : a) {
            if (property != null && property.getBedRooms() < i) {
                result[index] = property;
                index++;
            }
        }
        return result;
    }
    //group Edit
    public static void groupEdit(RealEstateProperty[] a, String s, Integer n) {
        for (RealEstateProperty property : a) {
            if (property != null && property.getPropertyType().equalsIgnoreCase(s)) {
                property.setBedRooms(property.getBedRooms() + n);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        RealEstateProperty [] realEstatePropertyArr =new RealEstateProperty[20];

        System.out.print("Enter the file name: ");
        String fileName=scanner.nextLine();
        
        try {
            File file=new File(fileName);
            Scanner fileScanner= new Scanner(file);
            int index=0;
            while(fileScanner.hasNext() && index < realEstatePropertyArr.length){
                
                //I have to improve this part to read two word for property type
                //for this assignement purpose I will write "single family" as "single_family"
                String propertyType = fileScanner.next();
                Integer bedRooms = fileScanner.nextInt();

                realEstatePropertyArr[index] = new RealEstateProperty(propertyType, bedRooms);
                index++;

            }
            fileScanner.close();

            for(int i=0; i<index; i++){
                System.out.println(realEstatePropertyArr[i]);
            }

        //Test Average
        System.out.println("Overall Average Bedrooms: " + overallAvg(realEstatePropertyArr));
        
        //Test Count three bedroom town house 
        RealEstateProperty threeBedRoomTownHouse= new RealEstateProperty("Town_house", 3);
        System.out.println("Three bedroom Town_House Count: " + count(realEstatePropertyArr, threeBedRoomTownHouse));

        //Testing Group Average
        System.out.println("Single family Group Average: " + groupAvg(realEstatePropertyArr, "Single_Family"));

        //Test less than
        RealEstateProperty[] lessThanTwoBedroom = lessThan(realEstatePropertyArr, 2);
            System.out.println("\nProperties with < 2 Bedrooms:");
            for (RealEstateProperty property : lessThanTwoBedroom) {
                System.out.println(property);
            }
        //Test Group Edit
        groupEdit(realEstatePropertyArr, "condo", 1);//add 1 bedroom to condo's
        System.out.println("New Group Average for condo: " + groupAvg(realEstatePropertyArr, "condo"));

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found");
        }
        
        scanner.close();   
    }
}
    
