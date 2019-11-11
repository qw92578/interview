package com.cd.interview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Package: com.cd.interview
 * @ClassName: A
 * @Author: fgq
 * @Description:
 * @Date: 2019/10/16 13:20
 */
public class A {

    public static void main(String[] args) throws ParseException{
        List<String> endDay = getEndDay("2019-10-13", "2019-10-15");

        System.out.println(endDay);
    }

    public static List<String> getEndDay(String beginDate, String endDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dBegin = sdf.parse(beginDate);
        Date dEnd = sdf.parse(endDate);
        List<String> datas = findDates(dBegin, dEnd);

        String format = datas.get(0);
        String s = datas.get(0).substring(0,4)+"-"+format.substring(4,6)+"-"+format.substring(6,8);
        datas.remove(0);
        datas.add(0,s);
        return datas;
    }

    public static  List<String> findDates(Date dBegin, Date dEnd){
        List<String> lDate = new ArrayList<String>();
        SimpleDateFormat sd = new SimpleDateFormat("yyyyMMdd");
        lDate.add(sd.format(dBegin));
        Calendar calBegin = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calBegin.setTime(dBegin);
        Calendar calEnd = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calEnd.setTime(dEnd);
        // 测试此日期是否在指定日期之后
        while (dEnd.after(calBegin.getTime()))
        {
            // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            calBegin.add(Calendar.DAY_OF_MONTH, 1);
            String format = sd.format(calBegin.getTime());
            String str = format.substring(0,4)+"-"+format.substring(4,6)+"-"+format.substring(6,8);
            lDate.add(str);
        }
        return lDate;
    }


}
