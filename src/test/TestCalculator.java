package test;

import java.io.IOException;

import main.DataCalculator;
import main.DataParser;
import main.DataSelector;
import main.Position;
import main.Team;

import org.jsoup.select.Elements;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
public class TestCalculator
{
	@Test
	public void testWRTargetsSumCorrect() throws IOException
	{
		DataSelector selector = new DataSelector();
		Elements elements = selector.selectWR(new DataParser().parse(Position.WIDE_RECEIVER, 2005), Team.CLEVELAND);
		DataCalculator calculator = new DataCalculator();
		Double actual = calculator.sumTargets(elements);
		Double expected = 300.0;
		assertThat(expected, is(equalTo(actual)));
	}
	
	@Test
	public void testTETargetsSumCorrect() throws IOException
	{
		DataSelector selector = new DataSelector();
		Elements elements = selector.selectTE(new DataParser().parse(Position.TIGHT_END, 2005), Team.CLEVELAND);
		DataCalculator calculator = new DataCalculator();
		Double actual = calculator.sumTargets(elements);
		Double expected = 92.0;
		assertThat(expected, is(equalTo(actual)));
	}
	
	@Test
	public void testRBTargetsSumCorrect() throws IOException
	{
		DataSelector selector = new DataSelector();
		Elements elements = selector.selectRBReceiving(new DataParser().parse(Position.RUNNING_BACK, 2005), Team.CLEVELAND);
		DataCalculator calculator = new DataCalculator();
		Double actual = calculator.sumTargets(elements);
		Double expected = 73.0;
		assertThat(expected, is(equalTo(actual)));
	}
	
	@Test
	public void testRBCarriesSumCorrect() throws IOException
	{
		DataSelector selector = new DataSelector();
		Elements elements = selector.selectRBRushing(new DataParser().parse(Position.RUNNING_BACK, 2005), Team.CLEVELAND);
		DataCalculator calculator = new DataCalculator();
		Double actual = calculator.sumCarries(elements);
		Double expected = 328.0;
		assertThat(expected, is(equalTo(actual)));
	}
}
