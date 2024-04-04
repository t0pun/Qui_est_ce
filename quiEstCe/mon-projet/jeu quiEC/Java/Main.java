package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Random;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Test");
			primaryStage.setMaximized(true);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Personnage> persos = genererJson();
		Personnage reponse = getRandom(persos);
		launch(args);
	}
	
	public static ArrayList<Personnage> genererJson() {
		
		String json = "[\n"
	              + "{'id':'Samuel','cheveux':'Blanc','barbe':'false','yeux':'Marron','couleurDePeau':'Blanc pâle','lunettes':'true','accessoire':'Aucun','genre':'Homme'},\n"
	              + "{'id':'Léon','cheveux':'Blond','barbe':'false','yeux':'Marron','couleurDePeau':'Blanc pâle','lunettes':'true','accessoire':'Aucun','genre':'Homme'},\n"
	              + "{'id':'Simon','cheveux':'Blanc','barbe':'false','yeux':'Marron','couleurDePeau':'Blanc pâle','lunettes':'true','accessoire':'Aucun','genre':'Homme'},\n"
	              + "{'id':'Martin','cheveux':'Gris','barbe':'false','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Chapeau','genre':'Homme'},\n"
	              + "{'id':'Luc','cheveux':'Brun','barbe':'true','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Aucun','genre':'Homme'},\n"
	              + "{'id':'Clara','cheveux':'Roux','barbe':'false','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'true','accessoire':'Chapeau','genre':'Femme'},\n"
	              + "{'id':'Anita','cheveux':'Blond','barbe':'false','yeux':'Bleu','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Aucun','genre':'Femme'},\n"
	              + "{'id':'Alfred','cheveux':'Roux','barbe':'true','yeux':'Bleu','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Aucun','genre':'Homme'},\n"
	              + "{'id':'Suzane','cheveux':'Blanc','barbe':'false','yeux':'Marron','couleurDePeau':'Blanc pâle','lunettes':'false','accessoire':'Aucun','genre':'Femme'},\n"
	              + "{'id':'Roméo','cheveux':'Chauve','barbe':'true','yeux':'Marron','couleurDePeau':'Blanc pâle','lunettes':'false','accessoire':'Aucun','genre':'Homme'},\n"
	              + "{'id':'Omar','cheveux':'Roux','barbe':'false','yeux':'Marron','couleurDePeau':'Blanc pâle','lunettes':'false','accessoire':'Aucun','genre':'Homme'},\n"
	              + "{'id':'Manu','cheveux':'Chatain','barbe':'true','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Aucun','genre':'Homme'},\n"
	              + "{'id':'Lucas','cheveux':'Roux','barbe':'false','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Aucun','genre':'Homme'},\n"
	              + "{'id':'Mario','cheveux':'Blond','barbe':'true','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Aucun','genre':'Homme'},\n"
	              + "{'id':'Jérémie','cheveux':'Chatain','barbe':'false','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Toque','genre':'Homme'},\n"
	              + "{'id':'Max','cheveux':'Brun','barbe':'true','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Aucun','genre':'Homme'},\n"
	              + "{'id':'Timéo','cheveux':'Brun','barbe':'false','yeux':'Vert','couleurDePeau':'Blanc pâle','lunettes':'true','accessoire':'Aucun','genre':'Homme'},\n"
	              + "{'id':'Oscar','cheveux':'Chatain','barbe':'false','yeux':'Bleu','couleurDePeau':'Blanc pâle','lunettes':'false','accessoire':'Aucun','genre':'Homme'},\n"
	              + "{'id':'Eric','cheveux':'Blanc','barbe':'false','yeux':'Bleu','couleurDePeau':'Blanc pâle','lunettes':'false','accessoire':'Aucun','genre':'Homme'},\n"
	              + "{'id':'Maria','cheveux':'Chatain','barbe':'false','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Béret','genre':'Femme'},\n"
	              + "{'id':'Tony','cheveux':'Roux','barbe':'true','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Aucun','genre':'Homme'},\n"
	              + "{'id':'Félix','cheveux':'Blond','barbe':'false','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Képi','genre':'Homme'},\n"
	              + "{'id':'Charlie','cheveux':'Blond','barbe':'true','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Aucun','genre':'Homme'},\n"
	              + "{'id':'Anna','cheveux':'Brun','barbe':'false','yeux':'Marron','couleurDePeau':'Blanc','lunettes':'false','accessoire':'Boucles oreilles','genre':'Femme'}\n"
	          + "]";
	
		Type persListType = new TypeToken<ArrayList<Personnage>>(){}.getType();
		ArrayList<Personnage> persos = new Gson().fromJson(json,persListType);
		return persos;
		/*for(int i = 0; i < 24; i++) {
			persos.get(i).afficher();
		}*/
	
	}
	
	public static Personnage getRandom(ArrayList<Personnage> persos) {
		int random = new Random().nextInt(persos.size());
		return persos.get(random);
	}
	
}
