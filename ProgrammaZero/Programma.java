
	class Programma{

    	 public int x;
  	 public double p;
	 public double a;
	 public static void main (String[] args)  {
	 Proposta figura= new Proposta(); //creo un oggeto 

	
	 try{
    	 int x=figura.domanda(); //richiede di quale figuara si tratta
       
	// i casi saranno :1 quadrato|2 rombo |3 rettangolo |4 triangolo
	if (x==1 || x==3){
		 /* se si tratta di un quadrato o un rettangolo
		  Proposta tori = new Proposta();
		  double b=tori.base();  //richiede la lunghezza della base o della diagonale minore
                  double h=tori.altezza(); //richiede la lunghezza dell'altezza
	          Quadrato quadratoObj = new Quadrato(); //creo un oggetto
                  Risposta risp= new Risposta(); 
		 double p=  quadratoObj.perimetro(b,h); //gli dico di utilizzare il metodo perimetro per calcolrare il perimetro
		 double a= quadratoObj.area(b,h); //calcolo l'area con il suo metod
		 risp.risposta(a,p);	//Stampa la risposta 
	/*	System.out.println(" L'area è di: => " + a +" Il perimetro è di: =>" + p);*/
		CalcQuadRett quattrolati = new CalcQuadRett();
		quattrolati.calcolo();
	}else if (x ==2){ // Rombo
		double noti= figura.datinoti();
		if (noti ==1){ /*Rombo con lato e altezza noti
			Proposta tori = new Proposta(); //creo un oggetto 
                  	Quadrato quadratoObj = new Quadrato(); //creo un oggetto
                  	Risposta risp= new Risposta();
	 		double b=tori.base();  //richiede la lunghezza della base o della diagonale minore
			double h=tori.altezza(); //richiede la lunghezza dell'altezza
			double a= quadratoObj.area(b,h); //calcolo l'area con il suo metod
			double p=  quadratoObj.perimetro(b,h); //gli dico di utilizzare il metodo perimetro per calcolrare il perimetro
//			Risposta risp= new Risposta();
                	risp.risposta(a,p);*/
			CalcQuadRett quattrolati = new CalcQuadRett();
                	quattrolati.calcolo();
			
	 	} else{/* Rombo con diagonli note
			Proposta tori = new Proposta();  
			Rombo romboObj= new Rombo();
//                        Quadrato quadratoObj = new Quadrato(); 
                        Risposta risp= new Risposta();
			double b=tori.diagoMag();  //richiede la lunghezza della base o della diagonale minore
                        double h=tori.diagoMin(); //richiede la lunghezza dell'altezza
			double a= romboObj.area(b, h);
			double p= romboObj.perimetro(b,h);
                        risp.risposta(a,p);*/
			CalcRomboDiag rombo = new CalcRomboDiag();
			rombo.calcolo();
			 }		
	}/* else if (x ==3){


	}*/
	 else if (x ==4){
		/* Proposta tori = new Proposta(); //creo un oggeto 
		double b=tori.base();  //richiede la lunghezza della base o della diagonale minore
                double h=tori.altezza(); //richiede la lunghezza dell'altezza
		Prototipo triangolo= new Prototipo();
		double p= triangolo.perimetro(b);
		double a= triangolo.area(b, h);
		 Risposta risp= new Risposta();
                 risp.risposta (a,p);*/
		CalcTriangolo triangolo =new CalcTriangolo();
		triangolo.calcolo();
		
	  }else{
		System.out.println("Inserisci i valori corrispondenti alle figure");
		}
	
	/*Risposta risp= new Risposta();
        risp.risposta(a, p);*/
      
       } catch (Exception e){

        System.out.println("non gira");

    } finally{
	System.out.println(" Digita =>  java Programma   <=per fare nuovi calcoli");
}
   }
 }
