package data;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class WebCrawler {

    public static void main(String[] args) throws UnsupportedEncodingException {
    	String url = "https://www.inflearn.com/course/스트링부트-핵심원리-활용";
        String encodedUrl = URLEncoder.encode(url, "UTF-8");
        System.out.println(encodedUrl);
    }
}