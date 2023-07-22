import java.util.Scanner;

public class MaximumSubarray {
    public static void maxSubarray(int[] C, int a, int b){
        int maxSum=0;
        for(int i=0;i<a;i++){
            int sum=0;
            for(int j=0;j<a;j++){
                if(sum+C[j]<=b){
                    sum+=C[i];
                }
            }
            if(maxSum<sum){
                maxSum=sum;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int[] array = new int[a];
        for(int i=0;i<a;i++){
            array[i]= sc.nextInt();
        }
        maxSubarray(array, a, b);
    }
}
