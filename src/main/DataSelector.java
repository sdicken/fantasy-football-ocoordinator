package main;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class DataSelector
{
	public Elements select(Document doc)
	{
		return doc.select(".stats");
	}
	
	public Elements selectByTeam(Elements elements, Team team)
	{
		return elements.select("tr:contains(" + team + ")");
	}
	
	public Elements selectWR(Document doc, Team team)
	{
		Elements statsTables = select(doc);
		statsTables.remove(2);
		return selectByTeam(statsTables, team);
	}
	
	public Elements selectTE(Document doc, Team team)
	{
		Elements statsTables = select(doc);
		return selectByTeam(statsTables, team);
	}
	
	public Elements selectRBRushing(Document doc, Team team)
	{
		Elements statsTables = select(doc);
		statsTables.remove(3);
		statsTables.remove(2);
		return selectByTeam(statsTables, team);
	}
	
	public Elements selectRBReceiving(Document doc, Team team)
	{
		Elements statsTables = select(doc);
		statsTables.remove(0);
		statsTables.remove(0);
		return selectByTeam(statsTables, team);
	}
}
