package gr.aueb.elearn.chapter7;

/**
 * sinenonei apotelesmatika alfarithmitika me thn
 * xrhsh tou StringBuilder
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        long timeStart, timeEnd;
        double stringConcatTime, stringBuilderConcatTime;


        //taxitika concat
        timeStart = System.currentTimeMillis();
        for (int i = 1; i < 5000 ; i++) {
            result +=1;
        }
        timeEnd = System.currentTimeMillis();
        stringConcatTime = (double) (timeEnd - timeStart) / 1000;

        //taxitika string builder
        timeStart = System.nanoTime();
        for (int i = 1; i < 5000 ; i++) {
            sb.append(i);
        }
        timeEnd = System.nanoTime();
        stringBuilderConcatTime = (double) (timeEnd - timeStart) / 1_000_000_000;

        System.out.println("Concatenations String vs StringBuilder time in sec");
        System.out.println(stringConcatTime + "sec vs " + stringBuilderConcatTime + " sec");

    }
}
