package main;

public enum Position 
{
	WIDE_RECEIVER("wr"),
	TIGHT_END("te"),
	RUNNING_BACK("rb");
	
	private final String positionAbbreviation;
	Position(String positionAbbreviation)
	{
		this.positionAbbreviation = positionAbbreviation;
	}
	
	@Override
	public String toString()
	{
		return positionAbbreviation;
	}
}
