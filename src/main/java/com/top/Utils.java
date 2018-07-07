package com.top;

import com.swj.framework.helper.StringHelper;

/**
 * Description
 *
 * @author 袁幸成【yuanxc@3vjia.com】
 * @since 2018/07/07 16:42
 */
public class Utils {

    public static String getMaxLengthStr(String str) {
        if (StringHelper.isNullOrEmpty(str)) {
            return "";
        }
        char maxChar = str.charAt(0);
        char maxLength = 1;
        char nextChar;
        char nextLength = maxLength;
        int length = str.length();
        for (int i = 1; i < length; i++) {
            nextChar = str.charAt(i);
            if (nextChar == str.charAt(i - 1)) {
                nextLength++;
            } else {
                nextLength = 1;
            }
            if (nextLength > maxLength) {
                maxChar = nextChar;
                maxLength = nextLength;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            result.append(maxChar);
        }
        return result.toString();
    }

}
