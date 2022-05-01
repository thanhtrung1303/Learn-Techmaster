package util;

import java.text.DecimalFormat;

public class util {
    public static String formatMoney(long money){
        String pattern = "###,###,###đ";
        DecimalFormat myFormat = new DecimalFormat(pattern);
        return myFormat.format(money);
    }
}
