public class BinarySearch {
    public static int binarysearch(int numbers[], int key){
        int start=0, end=numbers.length-1;
        int mid=(start+end)/2;
        while(start<=end){
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int numbers[]={4,6,8,10,11,12};
        int key=8;
        System.out.println("index of key is "+ binarysearch(numbers, key));
    }
    
}
