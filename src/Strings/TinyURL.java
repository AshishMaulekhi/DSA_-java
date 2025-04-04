package src.Strings;

import java.util.*;

public class TinyURL {
    Map<String, String> map = new HashMap<>();
    String baseUrl = "http://tinyurl.com/";
    Random rand = new Random();

    public String encode(String longUrl) {
        String key = String.valueOf(rand.nextInt(10000));
        map.put(key, longUrl);
        return baseUrl + key;
    }

    public String decode(String shortUrl) {
        return map.get(shortUrl.replace(baseUrl, ""));
    }

    public static void main(String[] args) {
        TinyURL obj = new TinyURL();
        String tiny = obj.encode("https://leetcode.com/problems/design-tinyurl");
        System.out.println(obj.decode(tiny));
    }
}

