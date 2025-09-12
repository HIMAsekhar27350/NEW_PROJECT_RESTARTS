public class revse {
    public static void main(String[] args) {
        int d,r,n;
        n=721;
        r=0;
        while (n>0){
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        System.out.println(r);
    }

}
