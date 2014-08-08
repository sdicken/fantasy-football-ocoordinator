package main;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class DataParser
{
	public final static String BASE_URL = "http://www.footballoutsiders.com/stats/";
	
	public Document parse(Position playerPosition, int year) throws IOException
	{
		return Jsoup.connect(BASE_URL + playerPosition + year).get();
	}
}
