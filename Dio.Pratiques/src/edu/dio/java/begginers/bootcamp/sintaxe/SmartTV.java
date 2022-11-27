package edu.dio.java.begginers.bootcamp.sintaxe;

public class SmartTV {
	boolean ligada ;
	int canal;
	int volume;

public SmartTV(int canal, int volume) {
		
	ligada = true;
	this.canal = canal;
	this.volume = volume;
	}

public SmartTV() {
	
	System.out.println("Desligando TV...");
	
}
public void aumentarVolume(int volume) {
	volume +=volume;
	System.out.println("Volume: ");
	for(int x = volume; this.volume < volume;x++)
	{
		System.out.println("%d, ");
	}
	System.out.println("");
}

public void desligarTv() {
	ligada = false;
	System.out.println("**");
}

public void exibir() {
	System.out.print("---------------\n");
	System.out.printf("   SMART TV\n"
			+"---------------\n"
			+ "TV Ligada?  %b\n"
			+ "Canal Atual: %d\n"
			+ "Volume: %d\n"
			+ "\n",ligada,canal,volume);
}
}