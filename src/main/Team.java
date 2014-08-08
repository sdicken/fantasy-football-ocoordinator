package main;

public enum Team 
{
	ARIZONA("ARI"),
	ATLANTA("ATL"),
	BALTIMORE("BAL"),
	BUFFALO("BUF"),
	CAROLINA("CAR"),
	CHICAGO("CHI"),
	CINCINNATI("CIN"),
	CLEVELAND("CLE"),
	DALLAS("DAL"),
	DENVER("DEN"),
	DETROI("DET"),
	GREEN_BAY("GB"),
	HOUSTON("HOU"),
	INDIANAPOLIS("IND"),
	JACKSONVILLE("JAC"),
	KANSAS_CITY("KC"),
	MIAMI("MIA"),
	MINNESOTA("MIN"),
	NEW_ENGLAND("NE"),
	NEW_ORLEANS("NO"),
	NEW_YORK_GIANTS("NYG"),
	NEW_YORK_JETS("NYJ"),
	OAKLAND("OAK"),
	PHILADELPHIA("PHI"),
	PITTSBURGH("PIT"),
	SAN_DIEGO("SD"),
	SEATTLE("SEA"),
	SAN_FRANCISCO("SF"),
	ST_LOUIS("STL"),
	TENNESSEE("TEN"),
	TAMPA_BAY("TB"),
	WASHINGTON("WAS");
	
	private final String teamAbbreviation;
	Team(String teamAbbreviation)
	{
		this.teamAbbreviation = teamAbbreviation;
	}
	
	@Override
	public String toString()
	{
		return teamAbbreviation;
	}
}
