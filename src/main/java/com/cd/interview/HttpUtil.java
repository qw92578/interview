package com.cd.interview;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Package: com.cd.interview
 * @ClassName: Test
 * @Author: fgq
 * @Description:
 * @Date: 2019/10/16 13:15
 */

public class HttpUtil {
    public static void main1(String[] args) {
        String s = HttpUtil.sendGet("https://zgdypw.cn/pors/w/webStatisticsDatas/api/2019-10-06/searchDayBoxOffice", "");
        System.err.println(s);
    }

    public static void main(String[] args) throws Exception {

//        Map<Integer,BigDecimal> idMap = new HashMap<>();
//        //发送 GET 请求
//        String s = HttpUtil.sendGet("https://zgdypw.cn/pors/w/webStatisticsDatas/api/2019-10-14/searchDayBoxOffice", "");
//        JSONObject json = JSONObject.parseObject(s);
//        json = (JSONObject) json.get("data");
//        JSONArray cityArry = (JSONArray)json.get("top10Citys");
//        for (int i = 0; i < cityArry.size(); i++) {
//            json = (JSONObject) cityArry.get(i);
//            Integer cityid = json.getInteger("id");
//            String cityName = json.getString("cityName");
//            BigDecimal totalSales = json.getBigDecimal("totalSales");
//            /**
//             * 城市每天数据
//             */
//            System.err.println("cityid: "+cityid+",cityName: "+cityName+"   totalSales:"+totalSales);
//            idMap.put(cityid,totalSales);
//        }


//        //发送 POST 请求
//        String sr=HttpRequest.sendPost("http://www.toutiao.com/stream/widget/local_weather/data/?city=%E4%B8%8A%E6%B5%B7", "");
//        JSONObject json = JSONObject.fromObject(sr);
//        System.out.println(json.get("data"));

        Map<String,String> dateMap = new HashMap<>();

        List<String> list = A.getEndDay("2019-01-01", "2019-09-01");
        list.forEach(date ->{
            dateMap.put(date,"");
        });


        BigDecimal sh = new BigDecimal(0);
        BigDecimal bj = new BigDecimal(0);
        BigDecimal gz = new BigDecimal(0);
        BigDecimal sz = new BigDecimal(0);
        BigDecimal cd = new BigDecimal(0);
        BigDecimal hz = new BigDecimal(0);
        BigDecimal cq = new BigDecimal(0);
        BigDecimal suzhou =new BigDecimal(0);
        BigDecimal wh = new BigDecimal(0);
        BigDecimal xa = new BigDecimal(0);
//        Do  Double bj = (double)0;
//        Double gz = (double)0;
//        Double sz = (double)0;
//        Double cd = (double)0;
//        Double hz = (double)0;
//        Double cq = (double)0;
//        Double suzhou = (double)0;
//        Double wh = (double)0;
//        Double xa = (double)0;

        int count = 0;
        Map<String,Object> failMap = new HashMap<>();

        for (String da: dateMap.keySet() ) {

            //发送 GET 请求
//            Thread.sleep(3000);
            String s = HttpUtil.sendGet("https://zgdypw.cn/pors/w/webStatisticsDatas/api/"+da+"/searchDayBoxOffice", "");
            JSONObject json = JSONObject.parseObject(s);
            json = (JSONObject) json.get("data");
            if (json != null) {
                JSONArray cityArry = (JSONArray)json.get("top10Citys");
                for (int i = 0; i < cityArry.size(); i++) {
                    json = (JSONObject) cityArry.get(i);
                    Integer cityid = json.getInteger("id");
                    String cityName = json.getString("cityName");
                    if (cityName.length()>=2)
                    cityName = cityName.substring(0,2);
                    BigDecimal totalSales = json.getBigDecimal("totalSales");
                    /**
                     * 城市每天数据
                     */
//                    System.err.println("cityid: "+cityid+",cityName: "+cityName+"   totalSales:"+totalSales);
                    switch (cityName) {
                        case "上海":
                            sh = sh.add(totalSales);
                        case "北京":
                            bj = bj.add(totalSales);
                            break;
                        case "广州":
                            gz = gz.add(totalSales);
                            break;
                        case "深圳":
                           sz = sz.add(totalSales);
                            break;
                        case "成都":
                            cd = cd.add(totalSales);
                            break;
                        case "杭州":
                            hz = hz.add(totalSales);
                            break;
                        case "重庆":
                            cq = cq.add(totalSales);
                            break;
                        case "苏州":
                            suzhou = suzhou.add(totalSales);
                            break;
                        case "武汉":
                            wh = wh.add(totalSales);
                            break;
                        case "西安":
                            xa = xa.add(totalSales);
                            break;
                        default:
                    }
//                idMap.put(cityid,totalSales);
                }
            }else {
                count ++;
                failMap.put(da,"");
            }




        }

        System.err.println("上海："+sh+" ,北京："+bj+" ,广州市："+gz+" ,深圳市："+sz+" ,成都市："+cd+" ,杭州市："+hz+" ,重庆市："+cq+" ,苏州市："+suzhou
                +" ,武汉市："+wh+" ,西安市："+xa);
        System.err.println("失败个数："+count+",  统计天数："+dateMap.size()+", 失败日期：" + failMap);

    }

    /**
     * 向指定URL发送GET方法的请求
     *
     * @param url   发送请求的URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 向指定 URL 发送POST方法的请求
     *
     * @param url   发送请求的 URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }
}
