package controleur;
import vue.EntreeJeu;

public class Controle {
	private EntreeJeu frmEntreeJeu;

	public static void main(String[] args) {
		new Controle();

	}

	public Controle() {
		this.frmEntreeJeu = new EntreeJeu();
		frmEntreeJeu.setVisible(true);
	}
}