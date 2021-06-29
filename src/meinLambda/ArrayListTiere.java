package meinLambda;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTiere
{

	public static void main(String[] args)
	{
		List<Tier>tiere = new ArrayList<Tier>();
		tiere.add(new Tier("Gazelle", true, false));
		tiere.add(new Tier("Gänsegeier", false, true));
		tiere.add(new Tier("Kondor", false, true));
		tiere.add(new Tier("Wolf", true, false));
		tiere.add(new Tier("Bär", true, false));
		tiere.add(new Tier("Biene", false, true));
		tiere.add(new Tier("Kolibri", false, true));
		tiere.add(new Tier("Basilisk", true, false));
		tiere.add(new Tier("Biber", true, false));
		tiere.add(new Tier("Star", false, true));
		
		print(tiere, t -> t.kannLaufen()); //LAMBDA für Läufer
		print(tiere, t -> t.kannFliegen()); // LAMBDA für Flieger
	}
	
	private static void print(List<Tier>tiere, PrüfeEigenschaft prüfer)
	{
		for(Tier tier : tiere)
		{
			if(prüfer.prüfe(tier))
			System.out.println(tier + "");
		}
		System.out.println();
	}

}
