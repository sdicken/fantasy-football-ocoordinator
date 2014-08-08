package main;

import java.io.IOException;
import java.text.NumberFormat;

import org.jsoup.nodes.Document;


public class Driver
{
	public static void main(String [] args) throws IOException
	{
		DataParser parser = new DataParser();
		DataSelector selector = new DataSelector();
		DataCalculator calculator = new DataCalculator();
		NumberFormat format = NumberFormat.getPercentInstance();
		
		for(int year = 2005; year < 2014; year++)
		{
			Document wideReceivers = parser.parse(Position.WIDE_RECEIVER, year);
			Document tightEnds = parser.parse(Position.TIGHT_END, year);
			Document runningBacks = parser.parse(Position.RUNNING_BACK, year);
			for(Team team : Team.values())
			{
				Double wrTargets = calculator.sumTargets(selector.selectWR(wideReceivers, team));
				Double teTargets = calculator.sumTargets(selector.selectTE(tightEnds, team));
				Double rbTargets = calculator.sumTargets(selector.selectRBReceiving(runningBacks, team));
				Double rbCarries = calculator.sumTargets(selector.selectRBRushing(runningBacks, team));
				
				Double totalTargets = wrTargets + teTargets + rbTargets;
				System.out.println("Year: " + year + ", Team: " + team + "% WR: " + format.format(wrTargets/totalTargets));
				System.out.println("Year: " + year + ", Team: " + team + "% TE: " + format.format(teTargets/totalTargets));
				System.out.println("Year: " + year + ", Team: " + team + "% RB: " + format.format(rbTargets/totalTargets));
			}
		}
	}
}
