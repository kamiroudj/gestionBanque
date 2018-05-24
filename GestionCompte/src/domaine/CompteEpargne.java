package domaine;

public class CompteEpargne extends Compte{
	
	private float taux;

	public CompteEpargne(float taux) {
		super();
		this.taux = taux;
	}
	
	public CompteEpargne(int code, float solde, float taux) {
		super(code, solde);
		this.taux = taux;
	}
	
	public void calculInterets() {
		solde = solde + solde * taux;
	}
	
	@Override
	public String toString() {		
		return "Informations sur votre compte epargne: \n" + super.toString() +
				", taux d'intérêts= " + taux;
	}
	

}
