import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class parseDate {



    private Date parseDate(String date) {

        final String inputFormat = "HH:mm:ss";
        SimpleDateFormat inputParser = new SimpleDateFormat(inputFormat, Locale.US);
        try {
            return inputParser.parse(date);
        } catch (java.text.ParseException e) {
            return new Date(0);
        }
    }
}
