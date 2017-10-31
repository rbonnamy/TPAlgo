package exercices.ex1.sub;

public class Client {

	private int age;
	private Compte compte;
	/**
	 * @param age
	 * @param compte
	 */
	public Client(int age, TypeCompte type, double solde) {
		super();
		this.age = age;
		this.compte = new Compte(type, solde);
	}
	/** Getter for age
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/** Setter
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/** Getter for compte
	 * @return the compte
	 */
	public Compte getCompte() {
		return compte;
	}
	/** Setter
	 * @param compte the compte to set
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
}
