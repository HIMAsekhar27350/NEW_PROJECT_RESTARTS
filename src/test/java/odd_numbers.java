public class odd_numbers {
    public static void main(String[] args) {
        int c=0;
        for(int i=1;i<=10;i++){
            if(i%2!=0){
                System.out.println(i);
                c++;
            }
        }
        System.out.println("Total odd number : "+c);
    }
}
