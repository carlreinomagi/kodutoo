package kauba_rongid;

public class Laomees {

	public static void alusteKogusRongis(Rong[] aluseid) {
		for( int i = 0; i < aluseid.length; i++){
			System.out.println(i+1+". "+aluseid[i]);
		}
		System.out.println("_____________________________________;");
	}

	public static void main(String[] args) {
		// Lisatakse juurde kaks rongi, �hes on 9 alust ja teises 25 alust.
		Rong[] rongid = new Rong[2];
		rongid[0] = new Rong(9);
		rongid[1] = new Rong(25);
		
		// Kui palju aluseid rongis on
		alusteKogusRongis(rongid);
		// �hest rongist v�etakse alus ja lisatakse teise. (t�stetakse �mber)
		rongid[0].eemaldaAlus();
		rongid[1].lisaAlus();
		
		// Rongis olevad alused loetakse �le.
		for(int i = 0; i < rongid.length; i++){
			System.out.println(i+1+". rongis on "+rongid[i].kysiAlusteKogus()+" alust");
		}
	}
	
}
