package gr.aueb.elearn.chapter2;

import java.util.Locale;
import java.util.Scanner;

/**
 * metatrepei meres, wres, lepta, kai deuterolepta
 * se sunolika deuterolepta
 *
 * @author
 */
public class DHMToSec {

    public static void main(String[] args) {
        final int SEC_PER_DAY = 24 * 3600;
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_MIN = 60;

        Scanner in = new Scanner(System.in);
        long days, hours, mins, secs, totalSec;

        //edoles

        System.out.println("doste meres, wres, lepta, deu/lepta");
        days = in.nextLong();
        hours = in.nextLong();
        mins = in.nextLong();
        secs = in.nextLong();

        totalSec = (days * SEC_PER_DAY) + (hours * SEC_PER_HOUR) + ( mins * SEC_PER_MIN) + secs;

        System.out.printf(Locale.US,"total sec: %,d", totalSec);

    }
}
