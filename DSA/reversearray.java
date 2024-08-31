public class reversearray{
    public static void reverse(int n[]){
        int i=0;
        int j=n.length-1;
        while(i<j){
            int temp=n[j];
            n[j]=n[i];
            n[i]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int n[]={2,4,6,8,10};
        reverse(n);
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+ " ");
        } 
        System.out.println();
    }
}