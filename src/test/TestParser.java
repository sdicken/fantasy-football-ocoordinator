package test;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import main.DataParser;
import main.Position;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class TestParser
{
	@Test
	public void testParseNotNull() throws IOException
	{
		DataParser parser = new DataParser();
		Document doc = parser.parse(Position.WIDE_RECEIVER, 2005);
		assertNotNull(doc);
	}
}
