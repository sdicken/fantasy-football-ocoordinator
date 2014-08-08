package test;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import main.DataParser;
import main.DataSelector;
import main.Position;
import main.Team;

import org.jsoup.select.Elements;
import org.junit.Test;

public class TestSelector
{
	@Test
	public void testSelectNotNull() throws IOException
	{
		DataSelector selector = new DataSelector();
		Elements elements = selector.selectRBRushing(new DataParser().parse(Position.RUNNING_BACK, 2005), Team.CLEVELAND);
		assertNotNull(elements);
	}
}
