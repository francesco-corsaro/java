	import java.util.*;
	import java.io.*  ;
/*creo una classe con i metodi per chiedere la figura gemetrica di cui si vuole calcolrare il perimetro e l'area.*/ 

 public  class Proposta{
		double b,h,a,p;
		double dMag, dMin;
		int x;
		int terminiNoti;

        public int domanda()throws IOException{  //Domanda iniziale per sapere di quale figura si tratta
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader h = new BufferedReader (input) ; //questo serve a ricevere l'input dalla tastiera e a leggerlo come se fosse una stringa
        System.out.print("Di quale figura vuoi misurare l'area e il perimetro? indica il numero |1 quadrato|2 rombo |3 rettangolo |4 triangolo : ");   // stampa una scritta sul terminale. Da notare che non è println ma solo print    
        x=Integer.parseInt(h.readLine().trim()); //converto la string in numero 
        return x;
	}

 
 	public  double base() throws IOException{  //chiede la misuara della base
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader h = new BufferedReader (input) ;             
        System.out.print("Quanto misura in cm la base o un lato ? =>");    
        b=Double.parseDouble(h.readLine().trim());  
        return b;
	}

 	public double altezza () throws IOException{ //chiede l'altezza
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader g = new BufferedReader (input) ;             
        System.out.print("Quanto misura l'altezza in cm? => ");     
        h=Double.parseDouble(g.readLine().trim()); 
        return h;
        }

	public int datinoti()throws IOException{ //Chiede se del rombo conosce i lati o le diagonali
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader h = new BufferedReader (input) ;             
        System.out.print("Quali sono i temrini noti? premi 1 se conosci il lato e l' altezza|2 se conosci le due duagonali : ");                       terminiNoti =Integer.parseInt(h.readLine().trim()); 	
        return terminiNoti;
}
	 public  double diagoMag() throws IOException{  //chiede la misuara della diagonale maggiore
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader h = new BufferedReader (input) ;
        System.out.print("Quanto misura in cm la diagonale maggiore ? =>");                                               
        dMag=Double.parseDouble(h.readLine().trim());                               
        return dMag;
        }
	
	public  double diagoMin() throws IOException{  //chiede la misuara della diagonale minore
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader h = new BufferedReader (input) ;
        System.out.print("Quanto misura in cm la diagonale minore ? =>");
        dMin=Double.parseDouble(h.readLine().trim());
        return dMin;
        }


}

 
