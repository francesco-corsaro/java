// creo una classe per le variabili che mi servono 
class Formule{
  public void misure() {
	float b; //base , diagonale maggiore
	float h; //altezza, diagonale minore
	float a; //area
	float p; //perimetro
	float l1;//lato 1 per il triangolo isoscele
	float l2; // lato2 per il triangolo sclaeno
	
  }
}
//creo una classe triangolo per misurare l'are
//ed eredita da formule
class Triangolo extends Formule{
  public void area(b,h) {
    	
	a=b*h/2;
  }

}
//creo una classe per il triangolo rettangolo 
//per calcolare il perimetro
class Rettangolo extends Triangolo {
  public void perimetro(b) {
    p=b*3;
  }
}
//creo una classe per il triangolo isocele e scaleno
class IsoScal extends Triangolo {
  public void perimetro(b,l1,l2) {
    p=b+l1+l2;
  }
}
//creo una classe quadrato
class Quadrato extends Formule{
  public void area(l1,l2) {
    	
	a=l1*l2;
 }
 public void perimetro(l1) {
	p=l1+4;
  }
}
class Rombo extends Formule{
	float dp1,dp2;
  public void area(d1,d2) {
    	
	a=d1*d2/2;
 }
 public void perimetro(d1,d2) {
	dp1=d1/2;
	dp2=d2/2;
	p=4*(sqrt(dp1^2)+sqrt(dp2^2));
  }

}

class Rettangolo extends Formule {
  public void area(b,h) {
    a=b*h;
  }
 public void perimetro(l1, l2) {
	p=l1*2+l2*2;
  }

}

class Geometria {
  public static void main(String[] args) {
	float x;
	InputStreamReader input= new InputStreamReader(System.in);
	BufferedReader h = new BufferedReader (input) ;             //questo serve a ricevere l'input dalla tastiera e a leggerlo come se fosse una stringa
	System.out.print("Che poligono è? 0=triangolo | 1= quadrato | 2= rombo | 3= rettangolo");               // stampa una scritta sul terminale che dice inserire x
								// da notare che non è println ma solo print	
	x=Integer.parseInt(h.readLine().trim()); //estraggo il valore e lo attribuisco a 
	switch(x){
	case 0:
		Triangolo ta= new Triangolo();
		Triangolo tp= new Triangolo();
		InputStreamReader input= new InputStreamReader(System.in);
	BufferedReader h = new BufferedReader (input) ;             //questo serve a ricevere l'input dalla tastiera e a leggerlo come se fosse una stringa
	System.out.print("Che triangolo è? 0=regolare | 1= irregolare ");               // stampa una scritta sul terminale che dice inserire x
								// da notare che non è println ma solo print	
	n=Integer.parseInt(h.readLine().trim()); //estraggo il valore e lo attribuisco a   
		switch (n){
			case 0:
			InputStreamReader input= new InputStreamReader(System.in);
	BufferedReader h = new BufferedReader (input) ;             
	System.out.print("Inserisci il valore della base");               
									
	v1=Integer.parseInt(h.readLine().trim());
	
	InputStreamReader input= new InputStreamReader(System.in);
	BufferedReader h = new BufferedReader (input) ;             
	System.out.print("Inserisci il valore dell'altezza");               
									
	v2=Integer.parseInt(h.readLine().trim());
	Triangolo ap= new Triangolo();
	
	System.out.println(" L'area è di " + ap.area(v1,v2));
	Triangolo pp= new Triangolo();		
	System.out.println(" L'area è di " + ap.perimetro(v1));
  }
}