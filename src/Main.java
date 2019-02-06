import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//sira yap
//tas kontrol yap

public class Main {

	static String[][] deger= {
			{"12","13","14","15","16","14","13","12"},
			{"11","11","11","11","11","11","11","11"},
			{"--","--","--","--","--","--","--","--"},
			{"--","--","--","--","--","--","--","--"},
			{"--","--","--","--","--","--","--","--"},
			{"--","--","--","--","--","--","--","--"},
			{"21","21","21","21","21","21","21","21"},
			{"22","23","24","25","26","24","23","22"},
	};
	static String[] ihtimal= {"--","--","--","--","--","--","--","--","--","--"};


	static JButton  btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,
					btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,
					btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,
					btn41,btn42,btn43,btn44,btn45,btn46,btn47,btn48,
					btn51,btn52,btn53,btn54,btn55,btn56,btn57,btn58,
					btn61,btn62,btn63,btn64,btn65,btn66,btn67,btn68,
					btn71,btn72,btn73,btn74,btn75,btn76,btn77,btn78,
					btn81,btn82,btn83,btn84,btn85,btn86,btn87,btn88;
	
	static String[][] btnString= {
			{"btn11","btn12","btn13","btn14","btn15","btn16","btn17","btn18"},
			{"btn21","btn22","btn23","btn24","btn25","btn26","btn27","btn28"},
			{"btn31","btn32","btn33","btn34","btn35","btn36","btn37","btn38"},
			{"btn41","btn42","btn43","btn44","btn45","btn46","btn47","btn48"},
			{"btn51","btn52","btn53","btn54","btn55","btn56","btn57","btn58"},
			{"btn61","btn62","btn63","btn64","btn65","btn66","btn67","btn68"},
			{"btn71","btn72","btn73","btn74","btn75","btn76","btn77","btn78"},
			{"btn81","btn82","btn83","btn84","btn85","btn86","btn87","btn88"},
	};
	
	static JButton[][] btn= {
			{btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18},
			{btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28},
			{btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38},
			{btn41,btn42,btn43,btn44,btn45,btn46,btn47,btn48},
			{btn51,btn52,btn53,btn54,btn55,btn56,btn57,btn58},
			{btn61,btn62,btn63,btn64,btn65,btn66,btn67,btn68},
			{btn71,btn72,btn73,btn74,btn75,btn76,btn77,btn78},
			{btn81,btn82,btn83,btn84,btn85,btn86,btn87,btn88},
	};
	
	static JLabel player1hamlecount,player2hamlecount;
	static int boyut=100,p1count=0,p2count=0,kademe=0,sira=0;
	static String secilenTas="",secilentasindex="";
	static JFrame frame;
	static JPanel panel;
	
	public static void main(String[] args) {
		MainScreen();
	}
	
	public static void MainScreen() {
		frame=new JFrame("Tabu");
		frame.setSize(1100, 870);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setSize(1100,870);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		
		btn_tanim();
		
		player1hamlecount=new JLabel("1. Oyuncu Hamle Sayýsý: "+p1count);
		player1hamlecount.setSize(200,50);
		player1hamlecount.setLocation(850,50);
		panel.add(player1hamlecount);
		
		player2hamlecount=new JLabel("2. Oyuncu Hamle Sayýsý: "+p2count);
		player2hamlecount.setSize(200,50);
		player2hamlecount.setLocation(850,75);
		panel.add(player2hamlecount);
		
		frame.add(panel);
		frame.repaint();
	}
	
	public static void btn_tanim() {
		int x=10,y=10;
		for(int i=0;i<btn.length;i++) {
			for(int j=0;j<btn[0].length;j++) {
				btn[i][j]=new JButton(tasYazisi(deger[i][j]));
				btn[i][j].setSize(boyut,boyut);
				btn[i][j].setLocation(x,y);
				btn[i][j].addActionListener(new Action());
				panel.add(btn[i][j]);
				if(secilenTas.equals(Integer.toString(i)+Integer.toString(j))) {
					btn[i][j].setBackground(Color.RED);
				}
				else {
					if(deger[i][j].charAt(0)=='1') {
						btn[i][j].setBackground(Color.WHITE);
					}else if(deger[i][j].charAt(0)=='2') {
						btn[i][j].setBackground(Color.BLACK);
					}else {
						btn[i][j].setBackground(Color.CYAN);
					}
				}
				x+=boyut;
			}
			x=10;
			y+=boyut;
		}
	}
	
	public static String tasYazisi(String deger) {
		
		String sonuc = null;
		
		if(deger.charAt(0)=='1') {
			if(deger.charAt(1)=='1') {
				sonuc="*piyon";
			}
			else if(deger.charAt(1)=='2') {
				sonuc="*kale";
			}
			else if(deger.charAt(1)=='3') {
				sonuc="*at";
			}
			else if(deger.charAt(1)=='4') {
				sonuc="*fil";
			}
			else if(deger.charAt(1)=='5') {
				sonuc="*vezir";
			}
			else if(deger.charAt(1)=='6') {
				sonuc="*þah";
			}
		}
		else if(deger.charAt(0)=='2') {
			if(deger.charAt(1)=='1') {
				sonuc="*piyon";
			}
			else if(deger.charAt(1)=='2') {
				sonuc="*kale";
			}
			else if(deger.charAt(1)=='3') {
				sonuc="*at";
			}
			else if(deger.charAt(1)=='4') {
				sonuc="*fil";
			}
			else if(deger.charAt(1)=='5') {
				sonuc="*vezir";
			}
			else if(deger.charAt(1)=='6') {
				sonuc="*þah";
			}
		}
		else {
			sonuc="--";
		}

		return sonuc;
	}
	

	
	static void tasKontrol(int i,int j) {
		String a=String.valueOf(i)+String.valueOf(j);
		if(secilenTas.charAt(1)=='1') {
			if(a.equals(ihtimal[0]) || a.equals(ihtimal[1]) ) {
				String b=secilentasindex.charAt(0)+"";
				String c=secilentasindex.charAt(1)+"";
				deger[Integer.parseInt(b)][Integer.parseInt(c)]="--";
				deger[i][j]=secilenTas;
				secilenTas="";
				kademe=0;
				frame.dispose();
				MainScreen();
			}
		}else if(secilenTas.charAt(1)=='2') {
			
		}else if(secilenTas.charAt(1)=='3') {
			
		}else if(secilenTas.charAt(1)=='4') {
			
		}else if(secilenTas.charAt(1)=='5') {
			
		}else if(secilenTas.charAt(1)=='6') {
			
		}
	}
	
	static void tasihtimal(int i,int j) {
		if(secilenTas.charAt(0)=='1') {
			if(secilenTas.charAt(1)=='1') {
				if(deger[i+1][j].equals("--")) {
					btn[i+1][j].setBackground(Color.GREEN);
					ihtimal[0]=String.valueOf(i+1)+String.valueOf(j);
				}
				if(deger[i+2][j].equals("--")) {
					btn[i+2][j].setBackground(Color.GREEN);
					ihtimal[1]=String.valueOf(i+2)+String.valueOf(j);
				}
			}else if(secilenTas.charAt(1)=='2') {
				
			}else if(secilenTas.charAt(1)=='3') {
			
			}else if(secilenTas.charAt(1)=='4') {
			
			}else if(secilenTas.charAt(1)=='5') {
			
			}else if(secilenTas.charAt(1)=='6') {
			
			}
		}else {
			if(secilenTas.charAt(1)=='1') {
				if(deger[i-1][j].equals("--")) {
					btn[i-1][j].setBackground(Color.GREEN);
					ihtimal[0]=String.valueOf(i-1)+String.valueOf(j);
				}
				if(deger[i-2][j].equals("--")) {
					btn[i-2][j].setBackground(Color.GREEN);
					ihtimal[0]=String.valueOf(i-2)+String.valueOf(j);

				}
			}else if(secilenTas.charAt(1)=='2') {
				
			}else if(secilenTas.charAt(1)=='3') {
			
			}else if(secilenTas.charAt(1)=='4') {
			
			}else if(secilenTas.charAt(1)=='5') {
			
			}else if(secilenTas.charAt(1)=='6') {
			
			}
		}	
	}
	
	static void tasrenkler() {
		for(int i=0;i<deger.length;i++) {
			for(int j=0;j<deger[0].length;j++) {
				if(deger[i][j].charAt(0)=='1') {
					btn[i][j].setBackground(Color.WHITE);
				}
				else if(deger[i][j].charAt(0)=='2') {
					btn[i][j].setBackground(Color.BLACK);
				}
				else if(deger[i][j].charAt(0)=='-') {
					btn[i][j].setBackground(Color.CYAN);
				}
			}
		}
	}
	
	static class Action implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			for(int i=0;i<btn.length;i++) {
				for(int j=0;j<btn[0].length;j++) {
					if(e.getSource()==btn[i][j] && kademe==0){
						if(deger[i][j].charAt(0)=='-') {
							
						}
						else {
							secilenTas=deger[i][j];
							secilentasindex=String.valueOf(i)+String.valueOf(j);
							btn[i][j].setBackground(Color.RED);
							kademe++;
							tasihtimal(i,j);
						}
					}
					else if(e.getSource()==btn[i][j] && kademe==1) {
						if(secilenTas.equals(deger[i][j])) {
							tasrenkler();
							secilenTas="";
							kademe--;
						}
						else {
							if(deger[i][j].charAt(0)=='-') {
								tasKontrol(i,j);
							}
						}	
					}
				}
			}	
		}
	}
}
