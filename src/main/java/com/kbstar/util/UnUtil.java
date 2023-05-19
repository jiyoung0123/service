package com.kbstar.util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.HttpURLConnection;
import java.net.URL;



public class UnUtil {



    public static String getUn() throws IOException {
        String url = "https://api.un7.kr/api/v1/life";

        String queryString = "birthYear={BIRTH_YEAR}&birthMonth={BIRTH_MONTH}&birthDay={BIRTH_DAY}&birthHour={BIRTH_HOUR}"
                + "&isLunar={IS_LUNAR}"
                + "&api-key={API_KEY}";
        queryString = queryString.replace("{API_KEY}", "943156c8f56a4c88fad1ba1379e3bf00"); //API KEY
        queryString = queryString.replace("{BIRTH_YEAR}", "1980");			 //생년
        queryString = queryString.replace("{BIRTH_MONTH}", "6");			 //생월
        queryString = queryString.replace("{BIRTH_DAY}", "30");				 //생일
        queryString = queryString.replace("{BIRTH_HOUR}", "12");			 //생시
        queryString = queryString.replace("{IS_LUNAR}", "false");			 //음력 여부, 양력이면 false로 주세요.

        URL obj = new URL(url + "?" + queryString);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setConnectTimeout(5000);
        con.setReadTimeout(5000);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        System.out.println(response.toString());
        return response.toString();
    }
}
