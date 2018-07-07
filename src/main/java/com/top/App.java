package com.top;

import com.swj.framework.helper.PackageHelper;
import com.swj.framework.helper.StringHelper;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Description
 * @author 袁幸成【yuanxc@3vjia.com】
 * @since 2018/7/7 10:03
 */
public class App {
    public static void main(String[] args) {
        System.out.println(StringHelper.convertToDate("2018-01-02 00:00:00", Calendar.getInstance().getTime()));
    }
}
