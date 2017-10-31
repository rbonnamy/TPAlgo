package exercices.ex2.sub;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String nom;
	private int age;
	private List<Compte> comptes;
	/**
	 * @param age
	 * @param compte
	 */
	public Client(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
		this.comptes = new ArrayList<>();
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
	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/** Getter for comptes
	 * @return the comptes
	 */
	public List<Compte> getComptes() {
		return comptes;
	}
	/** Setter
	 * @param comptes the comptes to set
	 */
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	
}
