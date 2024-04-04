package QuiEstCe;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.Node;



public class SampleController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    private static ArrayList<ImageView> listImg = new ArrayList<ImageView>();
    private boolean tricher;
    @FXML
    private Button historique;
    @FXML
    private TextArea texthist;
    @FXML
    private Button start;
    @FXML
    private Button rejouer;
    @FXML
    private Button jeu1;
    @FXML
    private Button jeu2;
    @FXML
    private Button ButtonTriche = new Button();
    @FXML
    private Button poser = new Button();
    @FXML
    private Text nbPersos;
    @FXML
    private Text modeTriche;
    @FXML
    private Text fin;
    @FXML
    private Text reponseC;
    @FXML
    private ImageView image0 = new ImageView();
    @FXML
    private ImageView image1 = new ImageView();
    @FXML
    private ImageView image2 = new ImageView();
    @FXML
    private ImageView image3 = new ImageView();
    @FXML
    private ImageView image4 = new ImageView();
    @FXML
    private ImageView image5 = new ImageView();
    @FXML
    private ImageView image6 = new ImageView();
    @FXML
    private ImageView image7 = new ImageView();
    @FXML
    private ImageView image8 = new ImageView();
    @FXML
    private ImageView image9 = new ImageView();
    @FXML
    private ImageView image10 = new ImageView();
    @FXML
    private ImageView image11 = new ImageView();
    @FXML
    private ImageView image12 = new ImageView();
    @FXML
    private ImageView image13 = new ImageView();
    @FXML
    private ImageView image14 = new ImageView();
    @FXML
    private ImageView image15 = new ImageView();
    @FXML
    private ImageView image16 = new ImageView();
    @FXML
    private ImageView image17 = new ImageView();
    @FXML
    private ImageView image18 = new ImageView();
    @FXML
    private ImageView image19 = new ImageView();
    @FXML
    private ImageView image20 = new ImageView();
    @FXML
    private ImageView image21 = new ImageView();
    @FXML
    private ImageView image22 = new ImageView();
    @FXML
    private ImageView image23 = new ImageView();
    @FXML
    private Button question;
    @FXML
    private Button deviner;
    @FXML
    private ImageView plateau = new ImageView();
    @FXML
    private ImageView background = new ImageView();
    @FXML
    private ImageView bgMenu = new ImageView();
    @FXML
    private Pane questions;
    @FXML
    private ChoiceBox<String> valeur = new ChoiceBox<>();
    @FXML
    private ChoiceBox<String> attribut = new ChoiceBox<>();
    @FXML
    private ChoiceBox<String> logique = new ChoiceBox<>();
    @FXML
    private CheckBox deuxp_checkbox = new CheckBox();

    private boolean QuestionsVisibles = false;
    private boolean Verifier = false;
    private boolean historiqueIsVisible = false;
    private ArrayList<String> valeurs_logique = new ArrayList<>();
    private ArrayList<Data> reponses_deuxp = new ArrayList<>();

    @FXML
    public void initialize() {

        plateau.setImage(new Image(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("plateau.png"))));
        background.setImage(new Image(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("background.png"))));
        bgMenu.setImage(new Image(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("menu.png"))));
        valeurs_logique.add("Au moins un des deux");
        valeurs_logique.add("Seulement un des deux");
        valeurs_logique.add("Les deux");
        logique.setItems(FXCollections.observableArrayList(valeurs_logique));
        reponses_deuxp.add(Main.lui);
        reponses_deuxp.add(Main.lui2);

    }

    @FXML
    public void lancerPartie(ActionEvent event) {

        setImages();
        start.setVisible(false);
        if(Main.deux_persos) {
            ButtonTriche.setVisible(false);
        }
    }

    @FXML
    public void switchToGame(ActionEvent event) throws IOException {

        root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("Sample.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 1289, 878);
        stage.setScene(scene);
        stage.show();
        listImg.clear();
    }

    @FXML
    public void switchToMenu(ActionEvent event) throws IOException {

        root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("Menu.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 1289, 878);
        stage.setScene(scene);
        stage.show();
        listImg.clear();

    }

    @FXML
    public void choixJeu1(ActionEvent event) throws IOException, URISyntaxException {

        Main.jsonPath = Main.class.getClassLoader().getResourceAsStream("jeu1.json");
        Main.listPersos = Main.genererList();
        Main.lui = Main.getRandom(Main.listPersos);
        if (Main.deux_persos) {
            do {
                Main.lui2 = Main.getRandom(Main.listPersos);
            } while (Main.lui2 == Main.lui);
            //System.out.println("----SEPARATOR----");
            //System.out.println(Main.lui);
            //System.out.println(Main.lui2);
            //System.out.println("----SEPARATOR----");
            logique.setVisible(true);

        }
        //System.out.println(Main.listPersos.size());
        for (int i = 0; i < 24; i++) {
            Main.listPersos.get(i).setIsUp(true);
            //System.out.println(Main.listPersos.get(i).toString());
        }
        switchToGame(event);
    }

    @FXML
    public void choixJeu2(ActionEvent event) throws IOException, URISyntaxException {

        Main.jsonPath = Main.class.getClassLoader().getResourceAsStream("jeu2.json");
        Main.listPersos = Main.genererList();
        Main.lui = Main.getRandom(Main.listPersos);
        //System.out.println(Main.listPersos.size());
        if (Main.deux_persos) {
            do {
                Main.lui2 = Main.getRandom(Main.listPersos);
            } while (Main.lui2 != Main.lui);
        }
        for (int i = 0; i < 24; i++) {
            Main.listPersos.get(i).setIsUp(true);
            //System.out.println(Main.listPersos.get(i).toString());
        }
        switchToGame(event);

    }

    @FXML
    public void changeMode(ActionEvent event) {
        if (deuxp_checkbox.isSelected()) {
            Main.deux_persos = true;
        } else Main.deux_persos = false;
    }

    @FXML
    public void setImages() {

        listImg.add(image0);
        listImg.add(image1);
        listImg.add(image2);
        listImg.add(image3);
        listImg.add(image4);
        listImg.add(image5);
        listImg.add(image6);
        listImg.add(image7);
        listImg.add(image8);
        listImg.add(image9);
        listImg.add(image10);
        listImg.add(image11);
        listImg.add(image12);
        listImg.add(image13);
        listImg.add(image14);
        listImg.add(image15);
        listImg.add(image16);
        listImg.add(image17);
        listImg.add(image18);
        listImg.add(image19);
        listImg.add(image20);
        listImg.add(image21);
        listImg.add(image22);
        listImg.add(image23);
        for (int i = 0; i < Main.listPersos.size(); i++) {
            Image image = new Image(getClass().getClassLoader().getResourceAsStream(Main.listPersos.get(i).getId() + ".png"));
            listImg.get(i).setImage(image);
        }
        int x0 = 335;
        int y1 = 368;
        int y2 = 461;
        int y3 = 554;
        image0.setLayoutX(x0);
        image0.setLayoutY(y1);
        image8.setLayoutX(x0);
        image8.setLayoutY(y2);
        image16.setLayoutX(x0);
        image16.setLayoutY(y3);

        for (int i = 1; i <= 7; i++) {
            listImg.get(i).setLayoutX(listImg.get(i - 1).getLayoutX() + 75);
            listImg.get(i).setLayoutY(y1);
        }

        for (int i = 9; i <= 15; i++) {
            listImg.get(i).setLayoutX(listImg.get(i - 1).getLayoutX() + 75);
            listImg.get(i).setLayoutY(y2);
        }

        for (int i = 17; i <= 23; i++) {
            listImg.get(i).setLayoutX(listImg.get(i - 1).getLayoutX() + 75);
            listImg.get(i).setLayoutY(y3);
        }

    }

    @FXML
    public void tricher(ActionEvent event) {

        if (tricher == false) {

            tricher = true;
            modeTriche.setVisible(true);
            nbPersos.setVisible(true);

        } else {

            tricher = false;
            modeTriche.setVisible(false);
            nbPersos.setVisible(false);

        }

    }

    @FXML
    public void afficherHistorique(ActionEvent event) {

        if (historiqueIsVisible == false) {
            historiqueIsVisible = true;
            texthist.setVisible(true);
        } else {
            historiqueIsVisible = false;
            texthist.setVisible(false);
        }

    }

    @FXML
    public void question(ActionEvent event) {
        if(!Main.deux_persos) {
            logique.setVisible(false);
        }
        //System.out.println(logique.getValue());
        //System.out.println(Main.deux_persos);
        ArrayList<String> valeurs_possibles = new ArrayList<>();
        attribut.setItems(Main.listPersos.get(0).getAttributs());
        attribut.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
                valeurs_possibles.clear();
                //System.out.println(attribut.getItems().get((Integer) number2));
                for (int i = 0; i < Main.listPersos.size(); i++) {
                    valeurs_possibles.add(Main.listPersos.get(i).getCaracs().get(attribut.getItems().get((Integer) number2)));
                    Set<String> valeurs_distinctes = new HashSet<>(valeurs_possibles);
                    valeur.setItems(FXCollections.observableArrayList(valeurs_distinctes));
                }
            }
        });
        if (QuestionsVisibles == false) {
            questions.setVisible(true);
            QuestionsVisibles = true;
        } else {
            questions.setVisible(false);
            QuestionsVisibles = false;
        }
    }

    public void poser(ActionEvent event) {

        int nbrPersos = 0;
        boolean v1 = valeur.getValue().toString().equals(Main.lui.getCaracs().get(attribut.getValue()));

        Main.lui.toString();
        boolean reponse = true;

        String phraseC = Main.capitalize(attribut.getValue().toString())+ " " + Main.capitalize(valeur.getValue().toString() + " " + "?");
        if(!Main.deux_persos) {
            if (v1) {

                texthist.appendText(phraseC + "\n" + "Oui" + "\n");
                reponseC.setText("Oui");
                reponse = true;
            } else {

                texthist.appendText(phraseC + "\n" + "Non" + "\n");
                reponseC.setText("Non");
                reponse = false;
            }

            if (tricher) {

                modeTriche.setVisible(true);
                for (int i = 0; i < 24; i++) {
                    if (Main.listPersos.get(i).getIsUp()) {

                        if (!reponse) {

                            if (Main.listPersos.get(i).getCaracs().get(attribut.getValue()).equals(valeur.getValue())) {
                                nbrPersos += 1;
                                changeSource(listImg.get(i), Main.class.getClassLoader().getResourceAsStream("cacher.png"));
                                Main.listPersos.get(i).setIsUp(false);
                            }

                        } else {
                            if (!(Main.listPersos.get(i).getCaracs().get(attribut.getValue()).equals(valeur.getValue()))) {
                                nbrPersos += 1;
                                changeSource(listImg.get(i), Main.class.getClassLoader().getResourceAsStream("cacher.png"));
                                Main.listPersos.get(i).setIsUp(false);

                            }

                        }

                    }
                }
                nbPersos.setText("Nombre de personnages trouvés : " + nbrPersos + "");
            }

        } else {

            boolean v2 = valeur.getValue().toString().equals(Main.lui2.getCaracs().get(attribut.getValue()));

                if (logique.getValue() == "Au moins un des deux") {
                    if (v1 || v2) {
                        reponseC.setText("Oui");
                        texthist.appendText(logique.getValue() + " : " + phraseC + "\n" + "Oui" + "\n");
                    } else {
                        reponseC.setText("Non");
                        texthist.appendText(logique.getValue() + " : " + phraseC + "\n" + "Non" + "\n");
                    }
                }

                if (logique.getValue() == "Seulement un des deux") {
                    if ((v1 || v2) && !(v1 && v2)) {
                        reponseC.setText("Oui");
                        texthist.appendText(logique.getValue() + " : " + phraseC + "\n" + "Oui" + "\n");
                    } else {
                        reponseC.setText("Non");
                        texthist.appendText(logique.getValue() + " : " + phraseC + "\n" + "Non" + "\n");
                    }
                }

                if (logique.getValue() == "Les deux") {
                    if (v1 && v2) {
                        reponseC.setText("Oui");
                        texthist.appendText(logique.getValue() + " : " + phraseC + "\n" + "Oui" + "\n");
                    } else {
                        reponseC.setText("Non");
                        texthist.appendText(logique.getValue() + " : " + phraseC + "\n" + "Non" + "\n");
                    }
                }
        }
    }



    @FXML
    public void deviner(ActionEvent event) {
        if (Verifier == false) {
            Verifier = true;
        } else {
            Verifier = false;
        }
    }

    public void changeStatut(MouseEvent event) {

        String source1 = "";
        String source2 = event.getPickResult().getIntersectedNode().getId();

        if (Verifier == false)

            for (int i = 0; i < 24; i++) {

                source1 = listImg.get(i).getId();

                if (source1.equals(source2)) {

                    //si le personnage a l'tat isUp true alors il devient false et change d'image.
                    //sinon isUp est faux donc il devient vrai et on change d'image.
                    if (Main.listPersos.get(i).getIsUp()) {
                        changeSource((ImageView) event.getSource(), getClass().getClassLoader().getResourceAsStream("cacher.png"));
                        Main.listPersos.get(i).setIsUp(false);
                    } else {
                        changeSource((ImageView) event.getSource(), getClass().getClassLoader().getResourceAsStream(Main.listPersos.get(i).getId() + ".png"));
                        Main.listPersos.get(i).setIsUp(true);
                    }
                }


            }

        if (Verifier == true) {


            source1 = "";
            source2 = event.getPickResult().getIntersectedNode().getId();

            if (!Main.deux_persos) {

                for (int i = 0; i < 24; i++) {
                    source1 = listImg.get(i).getId();

                    if (source1.equals(source2)) {

                        if (Main.listPersos.get(i).getIsUp()) {
                            if (Main.listPersos.get(i).getId() == Main.lui.getId()) {
                                fin.setVisible(true);
                                fin.setText("Gagné ! Bravo");
                                rejouer.setVisible(true);
                            } else {
                                fin.setVisible(true);
                                fin.setText("Perdu ! Le personnage était " + Main.lui.getId() + ". Réessayez !");
                                Verifier = false;
                                rejouer.setVisible(true);
                            }
                        }
                    }
                }

            }

            else {

                for (int i = 0; i < 24; i++) {
                    source1 = listImg.get(i).getId();

                    if (source1.equals(source2)) {

                        if (Main.listPersos.get(i).getIsUp()) {
                            for(int j = 0; j < reponses_deuxp.size(); j++) {
                                if (Main.listPersos.get(i).getId() == reponses_deuxp.get(j).getId()) {
                                    Data test = reponses_deuxp.get(j);
                                    reponses_deuxp.remove(j);
                                    //System.out.println("On a bien remove " + test.getId());
                                    //System.out.println(reponses_deuxp);
                                    if (reponses_deuxp.isEmpty()) {
                                        fin.setText("Gagné ! Bravo");
                                        rejouer.setVisible(true);
                                        //System.out.println("On est là");
                                    }
                                    else {
                                        fin.setVisible(true);
                                        fin.setText("Un des deux personnages a été trouvé !");
                                    }
                                } else {
                                    fin.setVisible(true);
                                    fin.setText("Perdu ! Les personnages étaient " + Main.lui.getId() + " et " + Main.lui2.getId() + ". Réessayez !");
                                    Verifier = false;
                                    rejouer.setVisible(true);
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    //changeSource pour changer la source de X
    public void changeSource(ImageView X, InputStream id) {
        X.setImage(new Image(id));
    }

}
