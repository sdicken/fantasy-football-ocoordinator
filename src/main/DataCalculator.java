package main;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DataCalculator
{
	public Double sumTargets(Elements tables)
	{
		Double targets = 0.0;
		for(Element table : tables)
		{
			Elements rows = table.getElementsByTag("tr");
			for(Element row : rows)
			{
				Elements receiver = row.getElementsByTag("td");
				
				Element targetsField;
				if(receiver.size() == 12 || receiver.size() == 13)
				{
					targetsField = receiver.get(6);
				}
				else
				{
					targetsField = receiver.get(9);
				}
				targets += Double.parseDouble(targetsField.text());
			}
		}
		return targets;
	}

	public Double sumCarries(Elements tables)
	{
		Double carries = 0.0;
		for(Element table : tables)
		{
			Elements rows = table.getElementsByTag("tr");
			for(Element row : rows)
			{
				Elements rusher = row.getElementsByTag("td");
				Element carriesField;
				if(rusher.size() == 11)
				{
					carriesField = rusher.get(6);
				}
				else
				{
					carriesField = rusher.get(9);
				}
				carries += Double.parseDouble(carriesField.text());
			}
		}
		return carries;
	}
}
