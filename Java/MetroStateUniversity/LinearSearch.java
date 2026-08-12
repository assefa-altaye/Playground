public class LinearSearch{
    public static int linearSearch(int [] nums, int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int [] data={3, 5, 2, 7, 9};
        int target=7;
        int result=linearSearch(data, target);
        if(result!=-1){
            System.out.println(target+" Found at index: " +result);
        }else{
            System.out.println("No result found with: " + target);
        }
    }
}
