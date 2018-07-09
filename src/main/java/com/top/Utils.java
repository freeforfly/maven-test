package com.top;

import com.swj.framework.helper.StringHelper;

import java.util.concurrent.CountDownLatch;

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
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < maxLength; i++) {
            result.append(maxChar);
        }
        System.out.println(result);
        return result.toString();
    }


    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(100);
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        latch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread() + ":" + Utils.getMaxLengthStr
                            ("fdssssssssfjljkkkkkkkkkkdr"));
                }
            }).start();
            latch.countDown();
        }
        System.out.println("============go======");
    }

}
