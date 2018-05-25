package domaine;

public class CompteSimple extends Compte{
	
	private float decouvert;
	
	public CompteSimple() {
		super();
	}

	public CompteSimple(float decouvert) {
		super();
		this.decouvert = decouvert;
	}
	
	public CompteSimple(int code, float solde, float decouvert) {
		super(code, solde);
		this.decouvert = decouvert;
	}
	
	@Override
	public void retirer(float mt) {		
		if (mt > (solde + decouvert)) System.out.println(" Vous ne disposez pas assez d'argent");
		else solde = solde - mt;		
	}
	
	@Override
	public String toString() {		
		return "Informations sur votre compte courant: \n" + super.toString() +
				", d�couvert= " + decouvert +"mohamed";
	}
	
	

}
