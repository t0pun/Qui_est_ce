package Projet;

public class Personnages {
	
	private String id;
	private String cheveux;
	private String pilosite;
	private String yeux;
	private String couleurDePeau;
	private boolean lunettes;
	private String accessoire;
	private String genre;
	private boolean isUp;
	private String srcImg;
	
	public Personnages(String id, String cheveux, String pilosite, String yeux, String couleurDePeau, boolean lunettes, String accessoire, String genre, boolean isUp, String srcImg) {
		
		this.id = id;
		this.cheveux = cheveux;
		this.pilosite = pilosite;
		this.yeux = yeux;
		this.couleurDePeau = couleurDePeau;
		this.lunettes = lunettes;
		this.accessoire = accessoire;
		this.genre = genre;
		this.isUp = isUp;
		this.srcImg = srcImg;
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCheveux() {
		return cheveux;
	}

	public void setCheveux(String cheveux) {
		this.cheveux = cheveux;
	}


	public String getPilosite() {
		return pilosite;
	}

	public void setPilosite(String pilosite) {
		this.pilosite = pilosite;
	}

	public boolean isUp() {
		return isUp;
	}

	public void setUp(boolean isUp) {
		this.isUp = isUp;
	}

	public String getYeux() {
		return yeux;
	}

	public void setYeux(String yeux) {
		this.yeux = yeux;
	}

	public String getCouleurDePeau() {
		return couleurDePeau;
	}

	public void setCouleurDePeau(String couleurDePeau) {
		this.couleurDePeau = couleurDePeau;
	}

	public boolean isLunettes() {
		return lunettes;
	}

	public void setLunettes(boolean lunettes) {
		this.lunettes = lunettes;
	}

	public String getAccessoire() {
		return accessoire;
	}

	public void setAccessoire(String accessoire) {
		this.accessoire = accessoire;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getImg() {
		return srcImg;
	}

	public String toString() {
		return "Prnom : " + this.id + "\n" + 
				"Couleur de cheveux : " + this.cheveux + "\n" + 
				"Pilosit : " + this.pilosite + "\n" + 
				"Couleur des yeux : " + this.yeux + "\n" + 
				"Couleur de peau : " + this.couleurDePeau + "\n" + 
				"Lunettes : " + this.lunettes + "\n" + 
				"Accessoire : " + this.accessoire + "\n" +
				"Genre : " + this.genre + "\n" +
				"isUp : " + this.isUp;
	}
	
	public void afficher() {
		System.out.println(toString());
	}

}
