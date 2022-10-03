package gr.aueb.elearn.chapter7;

public class StringConcatDemo {
    public static void main(String[] args) {
        String s1 = "alice", s2 ="bob";
        String s3;

        s3 = s1 + s2;
        System.out.printf("s1 = %s, s2 = %s, s3 = %s \n", s1,  s2, s3 );
        String s4=s3.concat(s2);
        System.out.printf("s3 = %s, s2 = %s, s4 = %s \n", s1,  s2, s4 );
    }
}
