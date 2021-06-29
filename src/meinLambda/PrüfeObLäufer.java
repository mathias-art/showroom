package meinLambda;

public class PrüfeObLäufer implements PrüfeEigenschaft
{
public boolean prüfe(Tier t)
{
	return t.kannLaufen();
}
}
