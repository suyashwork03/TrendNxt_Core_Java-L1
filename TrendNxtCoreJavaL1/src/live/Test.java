package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

class Test {
	public static void main(String a[])
	{
		Veena veena=new Veena();
		veena.play();
		Saxophone saxophone=new Saxophone();
		saxophone.play();
		Playable playable=veena;
		playable.play();
		playable=saxophone;
		playable.play();	
	}
	

}

