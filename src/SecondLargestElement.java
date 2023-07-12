import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(secondLargest(array,n));
    }
    static int secondLargest(int array[],int n){
        if(n<2){
            return -1;
        }else{
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,index=-1;
        for(int i=0;i<n;i++){
            if(max1<array[i]){
                max1=array[i];
                index=i;
            }
        }
        for(int i=0;i<n;i++){
            if(max2<array[i]&&i!=index){
                max2=array[i];
            }
        }
        return max2;}
    }
}
