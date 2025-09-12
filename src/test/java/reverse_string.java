public class reverse_string {
    public static void main(String[] args) {
        String o,r;
        o="hima";
        r="";
        for (int i=0;i<o.length();i++){
            r=o.charAt(i)+r;
        }
        System.out.println(r);
    }
}
