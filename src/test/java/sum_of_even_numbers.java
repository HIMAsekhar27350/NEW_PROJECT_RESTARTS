public class sum_of_even_numbers {
    public static void main(String[] args) {
        int n,i,sum=0;
        i=2;
        n=10;
        for(i=2;i<=n;i++){
            if(i%2==0){
                sum = sum+i;
            }
        }
        System.out.println("sum of the even number = "+sum);
    }
}
