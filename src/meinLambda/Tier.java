package meinLambda;

public class Tier
{
	private String art;
	private boolean kannLaufen;
	private boolean kannFliegen;
	
	public Tier(String artName, boolean läufer, boolean flieger) 
	{
		art = artName;
		kannLaufen = läufer;
		kannFliegen = flieger;
	}
	public boolean kannLaufen() { return kannLaufen;}
	public boolean kannFliegen() { return kannFliegen;}
	public String toString() { return art;}
	
	

}
