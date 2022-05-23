package util;

import java.text.DecimalFormat;

public class Util {
    public static String formatMoney(int money){
        String pattern="###,###,### VNĐ";
        DecimalFormat myFormat=new DecimalFormat(pattern);
        return myFormat.format(money);
    }
}
