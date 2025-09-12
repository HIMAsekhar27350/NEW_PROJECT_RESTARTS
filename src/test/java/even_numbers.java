public class even_numbers {
    public static void main(String[] args) {
        int i,c=0;
        for(i=1;i<=10;i++){
            if(i%2==0){
                System.out.println(i);
                c++;
            }
        }
        System.out.println("total even number : "+c);
    }
}
