package kauba_rongid;

public class Rong {
	int AluseidRongis = 1;
	int minAluseidRongis = 0;
	int maxAluseidRongis = 25;
	
	public void lisaAlus(){
		if(AluseidRongis < maxAluseidRongis){
			System.out.println("Rongis oli"+AluseidRongis+" alust");
			AluseidRongis++;
			System.out.println("Rongis on"+AluseidRongis+" alust");
		}
		else{
			System.out.println("Vagunid on aluseid täis");
		}
		System.out.println("_._____________________________________!");
	}
	
	public void eemaldaAlus(){
		if(AluseidRongis > minAluseidRongis){
			System.out.println("Rongis oli"+AluseidRongis+" alust");
			AluseidRongis--;
			System.out.println("Rongis on"+AluseidRongis+" alust");
		}
		else{
			System.out.println("Aluseid vagunites ei ole");
		}
	System.out.println("_____________________________________?");
	}
	
	public int kysiAlusteKogus(){
		return AluseidRongis;
	}
	
	public Rong(){
		this(0);
	}
	public Rong(int algseltAluseidRongis){
		if(algseltAluseidRongis>maxAluseidRongis){
			algseltAluseidRongis = maxAluseidRongis;
		}
		if(algseltAluseidRongis<maxAluseidRongis){
			algseltAluseidRongis = minAluseidRongis;
		}
		AluseidRongis = algseltAluseidRongis;
	}
	//väljastus inimkeeles.
	public String toString(){
		return "Rongis on "+AluseidRongis+" alust";
	}

}
