package application;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.image.ImageView;
import java.util.ArrayList;


public class initialisation {
	private ArrayList<Personnages> listePerso = new ArrayList<Personnages>();
	private ArrayList<ImageView> listeImg = new ArrayList<ImageView>();
	private ImageView image0= new ImageView();
	private ImageView image1= new ImageView();
	private ImageView image2= new ImageView();
	private ImageView image3= new ImageView();
	private ImageView image4= new ImageView();
	private ImageView image5= new ImageView();
	private ImageView image6= new ImageView();
	private ImageView image7= new ImageView();
	private ImageView image8= new ImageView();
	private ImageView image9= new ImageView();
	private ImageView image10= new ImageView();
	private ImageView image11= new ImageView();
	private ImageView image12= new ImageView();
	private ImageView image13= new ImageView();
	private ImageView image14= new ImageView();
	private ImageView image15= new ImageView();
	private ImageView image16= new ImageView();
	private ImageView image17= new ImageView();
	private ImageView image18= new ImageView();
	private ImageView image19= new ImageView();
	private ImageView image20= new ImageView();
	private ImageView image21= new ImageView();
	private ImageView image22= new ImageView();
	private ImageView image23= new ImageView();
	
	
	private Personnages p0 = new Personnages("Samuel",true);
	private Personnages p1 = new Personnages("Léon",true);
	private Personnages p2 = new Personnages("Simon",true);
	private Personnages p3 = new Personnages("Martin",true);
	private Personnages p4 = new Personnages("Luc",true);
	private Personnages p5 = new Personnages("Clara",true);
	private Personnages p6 = new Personnages("Anita",true);
	private Personnages p7 = new Personnages("Alfred",true);
	private Personnages p8 = new Personnages("Suzane",true);
	private Personnages p9 = new Personnages("Roméo",true);
	private Personnages p10 = new Personnages("Omar",true);
	private Personnages p11 = new Personnages("Manu",true);
	private Personnages p12 = new Personnages("Lucas",true);
	private Personnages p13 = new Personnages("Mario",true);
	private Personnages p14 = new Personnages("Jérémie",true);
	private Personnages p15 = new Personnages("Max",true);
	private Personnages p16 = new Personnages("Timéo",true);
	private Personnages p17 = new Personnages("Oscar",true);
	private Personnages p18 = new Personnages("Eric",true);
	private Personnages p19 = new Personnages("Maria",true);
	private Personnages p20 = new Personnages("Tony",true);
	private Personnages p21 = new Personnages("Félix",true);
	private Personnages p22 = new Personnages("Charlie",true);
	private Personnages p23 = new Personnages("Anna",true);
	
	
	
	public initialisation() {
		image0.setId("image0");
		image1.setId("image1");
		image2.setId("image2");
		image3.setId("image3");
		image4.setId("image4");
		image5.setId("image5");
		image6.setId("image6");
		image7.setId("image7");
		image8.setId("image8");
		image9.setId("image9");
		image10.setId("image10");
		image11.setId("image11");
		image12.setId("image12");
		image13.setId("image13");
		image14.setId("image14");
		image15.setId("image15");
		image16.setId("image16");
		image17.setId("image17");
		image18.setId("image18");
		image19.setId("image19");
		image20.setId("image20");
		image21.setId("image21");
		image22.setId("image22");
		image23.setId("image23");
		
		listeImg.add(image0);
		listeImg.add(image1);
		listeImg.add(image2);
		listeImg.add(image3);
		listeImg.add(image4);
		listeImg.add(image5);
		listeImg.add(image6);
		listeImg.add(image7);
		listeImg.add(image8);
		listeImg.add(image9);
		listeImg.add(image10);
		listeImg.add(image11);
		listeImg.add(image12);
		listeImg.add(image13);
		listeImg.add(image14);
		listeImg.add(image15);
		listeImg.add(image16);
		listeImg.add(image17);
		listeImg.add(image18);
		listeImg.add(image19);
		listeImg.add(image20);
		listeImg.add(image21);
		listeImg.add(image22);
		listeImg.add(image23);

		
		listePerso.add(p0);
		listePerso.add(p1);
		listePerso.add(p2);
		listePerso.add(p3);
		listePerso.add(p4);
		listePerso.add(p5);
		listePerso.add(p6);
		listePerso.add(p7);
		listePerso.add(p8);
		listePerso.add(p9);
		listePerso.add(p10);
		listePerso.add(p11);
		listePerso.add(p12);
		listePerso.add(p13);
		listePerso.add(p14);
		listePerso.add(p15);
		listePerso.add(p16);
		listePerso.add(p17);
		listePerso.add(p18);
		listePerso.add(p19);
		listePerso.add(p20);
		listePerso.add(p21);
		listePerso.add(p22);
		listePerso.add(p23);
	}
	
	public Personnages getXInListePersonnage(int x) {
		return listePerso.get(x);
	}
	public ImageView getXInListeImageView(int x) {
		return listeImg.get(x);
	}
	public ArrayList<Personnages> getListePersos(){
		return listePerso;
	}
	public ArrayList<ImageView> getListeImg(){
		return listeImg;
	}
}
