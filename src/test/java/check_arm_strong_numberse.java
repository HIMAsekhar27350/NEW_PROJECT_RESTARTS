public class check_arm_strong_numberse {
    public static void main(String[] args) {
        int d,n,s,o;
        d=0;
        n=153;s=0;
        o=n;
        while (n>0){
            d=n%10;
            s=s+d*d*d;
            n=n/10;
        }
        if(o==s){
            System.out.println("it is arm strong numbers");
        }else {
            System.out.println("it is not arm strong numbers");
        }
    }
}
