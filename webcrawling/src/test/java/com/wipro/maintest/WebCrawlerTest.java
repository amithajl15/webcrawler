package com.wipro.maintest;

import org.junit.Test;

import com.wipro.main.WebCrawler;


public class WebCrawlerTest {

	@Test
	public void testMain() {
		String args[]=new String[] {"https://www.wiprodigital.com/"};
		WebCrawler.main(args);
}
	@Test(expected=IllegalArgumentException.class)
	public void testMainForException() {
		String args[]=new String[] {"httsadfdsf"};
		WebCrawler.main(args);
		
	}
}
