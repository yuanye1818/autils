package cn.yuanye1818.autils.core.utils;

public class StringFunc {

    /***************************************
     *
     * 判断字符串是否为空。包括null和"","   "等
     *
     ***************************************/
    public static boolean isBlank(String text) {
        return text == null || text.trim().length() <= 0;
    }

    /***************************************
     *
     * 判断字符串是否有值，不包括"","  "等
     *
     ***************************************/
    public static boolean isNotBlank(String text) {
        return !isBlank(text);
    }

    /***************************************
     *
     * 格式化数字。比如12，格式化成4位的0012
     *
     * @param number 需要格式化的数字
     * @param digits 位数
     * @return 格式化的数字
     *
     ***************************************/
    public static String formatNumber(int number, int digits) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0, n = 1; i < digits; i++, n *= 10) {
            if (number / n == 0) {
                sb.append("0");
            }
        }
        sb.append(number);
        return sb.toString();
    }

    /***************************************
     *
     * object转换成string
     *
     ***************************************/
    public static String toString(Object obj) {
        if (obj == null) {
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            return String.valueOf(obj);
        }
    }

}
