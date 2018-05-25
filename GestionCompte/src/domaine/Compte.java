package domaine;

public class Compte {
	
	private int code;
	protected float solde;
	private static int nbComptes = 3;
	
	public Compte() {
		
	}
	
	public Compte(int code, float solde) {
		super();
		this.code = code;
		this.solde = solde;
	}

	public void verser(float mt){		
		solde = solde + mt;
	}
	
	
	
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public static int getNbComptes() {
		return nbComptes;
	}

	public static void setNbComptes(int nbComptes) {
		Compte.nbComptes = nbComptes;
	}

	public void retirer(float mt) {		
		if (mt > solde) System.out.println(" Vous ne disposez pas assez d'argent");
		else solde = solde - mt;		
	}

	@Override
	public String toString() {
		
		return "code= " + code + ", solde=" + solde+"kamir" ;
	}
	
	

}
