package com.wipro.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebCrawler {

    public static void main(String[] args) {
    	List<String> links=new ArrayList<String>();
    	String url=args[0];
        Document document;
		try {
			document = Jsoup.connect(url).get();
		
        Elements linksOnPage = document.select("[href]");
        for (Element page : linksOnPage) {
        	System.out.println(page.attr("abs:href"));
            links.add(page.attr("abs:href"));
        }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

}
