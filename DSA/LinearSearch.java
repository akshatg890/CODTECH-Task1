public class LinearSearch {
    public static int linearsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int numbers[]={10,20,3,24,6,8};
        int key=24;
        int result=linearsearch(numbers, key);
        if(result!=-1){
            System.out.println("element found"+ result);

        }else{
            System.out.println("failed");
        }
        
    }
    
}
