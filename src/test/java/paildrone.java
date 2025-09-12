public class paildrone {
    public static void main(String[] args) {
        int n,d,r,o;
        n=141;
        d=0;
        r=0;
        o=n;
        while (n>0){
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if(o==r){
            System.out.println("it is a palidron");
        }else {
            System.out.println("it is not paildrone");
        }
    }
}
