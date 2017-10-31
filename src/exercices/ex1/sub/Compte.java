package exercices.ex1.sub;

public class Compte {

	private double solde;
	private TypeCompte type;

	/**
	 * @param solde
	 */
	public Compte(TypeCompte type, double solde) {
		super();
		this.type = type;
		this.solde = solde;
	}

	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/** Getter for type
	 * @return the type
	 */
	public TypeCompte getType() {
		return type;
	}

	/** Setter
	 * @param type the type to set
	 */
	public void setType(TypeCompte type) {
		this.type = type;
	}
}
