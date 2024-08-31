public class largestnumber {
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    static void insertElement(int arr[], int n, int x, int pos){
    // shift elements to the right
    // which are on the right side of pos
    for (int i = n - 1; i >= pos; i--)
        arr[i + 1] = arr[i];
    arr[pos] = x;
    }

    }
    public static void main(String[] args) {
        int numbers[]={10,20,3,24,6,8};
        int large=getLargest(numbers);
        System.out.println(large);
    }
    
}
