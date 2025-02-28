package ma.jobintech.proxibanquev3.metier.compte;

import java.util.List;

import ma.jobintech.proxibanquev3.entities.Compte;

public interface ICompteEJB {

	public boolean ajouterCompte(Compte compte);

	public boolean supprimerCompte(Long id);

	public boolean modifierCompte(Compte compte);

	public Compte recupererCompte(Long id);

	public List<Compte> recuperComptes();

	Compte recupCpteParNumCpte(Long numeroCompte);

	boolean verser(double montant, long numeroCompte);

	boolean retirer(double montant, long numeroCompte);

	boolean virement(Double montant, Long comptePay, Long compteRemove);

}