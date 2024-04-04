package application;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class SampleController {
	private ArrayList<ImageView> listImg = genererImageView();
	private ArrayList<Personnage> listPersos = genererJson();
	private HashMap<ImageView,Personnage> hm = genererHashMap(listImg,listPersos);
	@FXML private Button question;
	@FXML private Button deviner;
	@FXML private ImageView plateau;
	@FXML private ImageView selectionne;
	@FXML private Button historique;
	@FXML private TextArea text;
	@FXML private ChoiceBox<String> bbox;
	@FXML private ChoiceBox<String> poils;
	@FXML private ChoiceBox<String> genre;
	@FXML private ChoiceBox<String> yeux;
	@FXML private ChoiceBox<String> lunettes;
	@FXML private ChoiceBox<String> accessoires;
	@FXML private TabPane questions;
	ObservableList<String> boxListC = FXCollections.observableArrayList("blonds ?", "bruns ?", "blancs ?", "gris ?", "roux ?", "chatains ?");
	ObservableList<String> boxListP = FXCollections.observableArrayList("aucune pilosit ?", "de la barbe ?", "une moustache ?");
	ObservableList<String> boxListG = FXCollections.observableArrayList("un homme ?", "une femme ?");
	ObservableList<String> boxListY = FXCollections.observableArrayList("marrons ?", "verts ?", "bleus ?");
	ObservableList<String> boxListL = FXCollections.observableArrayList("Oui", "Non");
	ObservableList<String> boxListA = FXCollections.observableArrayList("un chapeau ?", "un bret ?", "un kpi ?", "une toque ?" , "des boucles d'oreilles?", "aucun accessoire?");

	private boolean QuestionsVisibles = false;
	private boolean Verifier = false;
	private boolean historiqueIsVisible  = false;

	@FXML
    private void initialize() {
    	bbox.setItems(boxListC);
    	bbox.setValue("cheveux");
    	poils.setItems(boxListP);
    	poils.setValue("pilosit");
    	genre.setItems(boxListG);
    	genre.setValue("genre");
    	yeux.setItems(boxListY);
    	yeux.setValue("yeux");
    	lunettes.setItems(boxListL);
    	lunettes.setValue("lunettes");
    	accessoires.setItems(boxListA);
    	accessoires.setValue("accessoire");
	}
	
	@FXML
	public void question(ActionEvent event) {
		if(QuestionsVisibles == false) {
			questions.setVisible(true);
			listPersos.get(0).afficher();
			QuestionsVisibles = true;
		}
		else {
			questions.setVisible(false);
			QuestionsVisibles = false;
		}
	}
	
	@FXML
	public void deviner(ActionEvent event) {
		System.out.println(lui.getId());
		if(Verifier == true) {
			Verifier = false;
		}
		else {
			Verifier = true;
		}
	}
	
	public void onMouseOver(MouseEvent event) {
		double coteX = 0;
		double coteY = 0;
		coteX = event.getPickResult().getIntersectedNode().getLayoutX();
		coteY = event.getPickResult().getIntersectedNode().getLayoutY();
		selectionne.setVisible(true);
		selectionne.setLayoutX(coteX);
		selectionne.setLayoutY(coteY);
	}
	@FXML
	public void historique(ActionEvent event) {
		if( historiqueIsVisible==false) {
			text.setVisible(true);
			historiqueIsVisible  = true;
		
		} else {text.setVisible(false);
		  historiqueIsVisible=false;
		}
	}
	
	@FXML
	public void changeStatut() {
	}
	
	public static ArrayList<Personnage> genererJson() {
		
		String json = "[\n"
	              + "{'id':'Samuel','srcImg':'file:Samuel.png','cheveux':'Blanc','pilosite':'Aucune','yeux':'Marron','couleurDePeau':'Blanc ple','lunettes':'true','accessoire':'Aucun','genre':'Homme','isUp':'true'},\n"
	              + "{'id':'Léon','srcImg':'file:Léon.png','cheveux':'Blond','pilosite':'Aucune','yeux':'Marron','couleurDePeau':'Blanc ple','lunettes':'true','accessoire':'Aucun','genre':'Homme','isUp':'true'},\n"
	              + "{'id':'Simon','srcImg':'file:Simon.png','cheveux':'Blanc','pilosite':'Aucune','yeux':'Marron','couleurDePeau':'Blanc ple','lunettes':'true','accessoire':'Aucun','genre':'Homme','isUp':'true'},\n"
	              + "{'id':'Martin','srcImg':'file:Martin.png','cheveux':'Gris','pilosite':'Aucune','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Chapeau','genre':'Homme','isUp':'true'},\n"
	              + "{'id':'Luc','srcImg':'file:Luc.png','cheveux':'Brun','pilosite':'Barbe','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Aucun','genre':'Homme','isUp':'true'},\n"
	              + "{'id':'Clara','srcImg':'file:Clara.png','cheveux':'Roux','pilosite':'Aucune','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'true','accessoire':'Chapeau','genre':'Femme','isUp':'true'},\n"
	              + "{'id':'Anita','srcImg':'file:Anita.png','cheveux':'Blond','pilosite':'Aucune','yeux':'Bleu','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Aucun','genre':'Femme','isUp':'true'},\n"
	              + "{'id':'Alfred','srcImg':'file:ALfred.png','cheveux':'Roux','pilosite':'Moustache','yeux':'Bleu','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Aucun','genre':'Homme','isUp':'true'},\n"
	              + "{'id':'Suzane','srcImg':'file:Suzane.png','cheveux':'Blanc','pilosite':'Aucune','yeux':'Marron','couleurDePeau':'Blanc ple','lunettes':'false','accessoire':'Aucun','genre':'Femme','isUp':'true'},\n"
	              + "{'id':'Roméo','srcImg':'file:Roméo.png','cheveux':'Chauve','pilosite':'Barbe','yeux':'Marron','couleurDePeau':'Blanc ple','lunettes':'false','accessoire':'Aucun','genre':'Homme','isUp':'true'},\n"
	              + "{'id':'Omar','srcImg':'file:Omar.png','cheveux':'Roux','pilosite':'Aucune','yeux':'Marron','couleurDePeau':'Blanc ple','lunettes':'false','accessoire':'Aucun','genre':'Homme','isUp':'true'},\n"
	              + "{'id':'Manu','srcImg':'file:Manu.png','cheveux':'Chatain','pilosite':'Moustache','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Aucun','genre':'Homme','isUp':'true'},\n"
	              + "{'id':'Lucas','srcImg':'file:Lucas.png','cheveux':'Roux','pilosite':'Aucune','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Aucun','genre':'Homme','isUp':'true'},\n"
	              + "{'id':'Mario','srcImg':'file:Mario.png','cheveux':'Blond','pilosite':'Barbe','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Aucun','genre':'Homme','isUp':'true'},\n"
	              + "{'id':'Jérémie','srcImg':'file:Jérémie.png','cheveux':'Chatain','pilosite':'Aucune','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Toque','genre':'Homme','isUp':'true'},\n"
	              + "{'id':'Max','srcImg':'file:Max.png','cheveux':'Brun','pilosite':'Moustache','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Aucun','genre':'Homme','isUp':'true'},\n"
	              + "{'id':'Timéo','srcImg':'file:Timéo.png','cheveux':'Brun','pilosite':'Aucune','yeux':'Vert','couleurDePeau':'Blanc ple','lunettes':'true','accessoire':'Aucun','genre':'Homme','isUp':'true'},\n"
	              + "{'id':'Oscar','srcImg':'file:Oscar.png','cheveux':'Chatain','pilosite':'Aucune','yeux':'Bleu','couleurDePeau':'Blanc ple','lunettes':'false','accessoire':'Aucun','genre':'Homme','isUp':'true'},\n"
	              + "{'id':'Eric','srcImg':'file:Eric.png','cheveux':'Blanc','pilosite':'Aucune','yeux':'Bleu','couleurDePeau':'Blanc ple','lunettes':'false','accessoire':'Aucun','genre':'Homme','isUp':'true'},\n"
	              + "{'id':'Maria','srcImg':'file:Maria.png','cheveux':'Chatain','pilosite':'Aucune','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Béret','genre':'Femme','isUp':'true'},\n"
	              + "{'id':'Tony','srcImg':'file:Tony.png','cheveux':'Roux','pilosite':'Barbe','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Aucun','genre':'Homme','isUp':'true'},\n"
	              + "{'id':'Félix','srcImg':'file:Félix.png','cheveux':'Blond','pilosite':'Aucune','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Képi','genre':'Homme','isUp':'true'},\n"
	              + "{'id':'Charlie','srcImg':'file:Charlie.png','cheveux':'Blond','pilosite':'Moustache','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Aucun','genre':'Homme','isUp':'true'},\n"
	              + "{'id':'Anna','srcImg':'file:Anna.png','cheveux':'Brun','pilosite':'Aucune','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Boucles oreilles','genre':'Femme','isUp':'true'}\n"
	          + "]";
	
		Type persListType = new TypeToken<ArrayList<Personnage>>(){}.getType();
		ArrayList<Personnage> listPersos = new Gson().fromJson(json,persListType);
		return listPersos;
		
	}

	public static ArrayList<ImageView> genererImageView() {
	
		ArrayList<ImageView> listImg = new ArrayList<ImageView>();
	
		for(int i = 0; i <= 23; i++) {
			ImageView image = new ImageView();
			image.setId("image" + i);
			listImg.add(image);
		}
	
		return listImg;
	
	}
	
	public static HashMap<ImageView,Personnage> genererHashMap(ArrayList<ImageView> listImg,ArrayList<Personnage> listPersos) {
		
		HashMap<ImageView,Personnage> dictionnaire = new HashMap<ImageView,Personnage>();
		
		for(int i = 0; i <= 23; i++) {
			
			dictionnaire.put(listImg.get(i),listPersos.get(i));
			
		}
		
		return dictionnaire;
		
	}
	
	public static Personnage getRandom(ArrayList<Personnage> listPersos) {
		int random = new Random().nextInt(listPersos.size());
		return listPersos.get(random);
	}

	
	public void changeStatut(MouseEvent event) {
		String source1 = "";
		String source2 = event.getPickResult().getIntersectedNode().getId();
//		System.out.println(event.getSource());
//		System.out.println(debut.getXInListeImageView(0).getId());
//		System.out.println(event.getPickResult().getIntersectedNode().getId());

		if(Verifier == false) {
			for(int i=0;i<24;i++) {
				source1 = listImg.get(i).getId();
				
				if(source1.equals(source2)) {
//					System.out.println(listPersos.get(i).getId());
//					System.out.println(listPersos.get(i).isUp());
//					System.out.println(event.getSource());
//					System.out.println(plateau);
					
					
					//si le personnage a l'état isUp true alors il devient false et change d'image.
					//sinon isUp est faut donc il devient vrai et on change d'image.
					if(listPersos.get(i).isUp()) {
						changeSource((ImageView)event.getSource(),"D:\\Users\\Moi\\Desktop\\Programmes\\SceneBuilder\\personnages\\cacher.png");
						listPersos.get(i).setUp(false);
					}
					
					else {
						changeSource((ImageView)event.getSource(),"D:\\Users\\Moi\\Desktop\\Programmes\\SceneBuilder\\personnages\\"+source2+".png");
						listPersos.get(i).setUp(true);
					}
				}
			}
		}
		else {
			for(int i=0;i<24;i++) {
				source1 = listImg.get(i).getId();
				if(source1.equals(source2)) {

					if(listPersos.get(i).isUp() == true) {
						if(listPersos.get(i).getId() == lui.getId()) {
							System.out.println("GG");
//fin serait une image vide pour empecher le joueur de cliquer autre part vu qu'il a terminé
//							fin.setVisible(true);
						}
						else {
	                        System.out.println("Bruh");
	                        Verifier = false;
						}
					}
				}
			}
		}
	}


	
	//changeSource pour changer la source de X
	public void changeSource(ImageView X,String id) {
		X.setImage(new Image(id));
	}

}
