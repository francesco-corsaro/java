
	class Programma{

    	 public int x;
  	 public float p;
	 public float a;
	 public static void main (String[] args)  {
	 Proposta figura= new Proposta(); //creo un oggeto 
//	 Quadrato quadratoObj = new Quadrato(); //creo un oggetto
//	Prototipo triangolo= new Prototipo();
//	 Risposta risp= new Risposta();
	//1 quadrato|2 rombo |3 rettangolo |4 triangolo 	
	 try{
    	 int x=figura.domanda(); //richiede di quale figuara si tratta
//	float b=figura.base();  //richiede la lunghezza della base o della diagonale minore
//	float h=figura.altezza(); //richiede la lunghezza dell'altezza

       

	if (x==1 || x==3){
		 // se si tratta di un quadrato o un rettangolo
		  Proposta tori = new Proposta();
		  float b=tori.base();  //richiede la lunghezza della base o della diagonale minore
                  float h=tori.altezza(); //richiede la lunghezza dell'altezza
	          Quadrato quadratoObj = new Quadrato(); //creo un oggetto
                  Risposta risp= new Risposta(); 
		 float p=  quadratoObj.perimetro(b,h); //gli dico di utilizzare il metodo perimetro per calcolrare il perimetro
		 float a= quadratoObj.area(b,h); //calcolo l'area con il suo metod
		 risp.risposta(a,p);	//Stampa la risposta 
	/*	System.out.println(" L'area è di: => " + a +" Il perimetro è di: =>" + p);*/
	}else if (x ==2){
		float noti= figura.datinoti();
		if (noti ==1){
			Proposta tori = new Proposta(); //creo un oggeto 
                  	Quadrato quadratoObj = new Quadrato(); //creo un oggetto
                  	Risposta risp= new Risposta();
	 		float b=tori.base();  //richiede la lunghezza della base o della diagonale minore
			float h=tori.altezza(); //richiede la lunghezza dell'altezza
			float a= quadratoObj.area(b,h); //calcolo l'area con il suo metod
			float p=  quadratoObj.perimetro(b,h); //gli dico di utilizzare il metodo perimetro per calcolrare il perimetro
//			Risposta risp= new Risposta();
                	risp.risposta(a,p);
	 	} else{
			Proposta tori = new Proposta();  
			Prototipo triangolo= new Prototipo();
                        Quadrato quadratoObj = new Quadrato(); 
                        Risposta risp= new Risposta();
			float b=tori.base();  //richiede la lunghezza della base o della diagonale minore
                        float h=tori.altezza(); //richiede la lunghezza dell'altezza
			float a= triangolo.area(b, h);
			float p=  quadratoObj.perimetro(b,h);
                        risp.risposta(a,p);
			 }		
	}/* else if (x ==3){


	}*/
	 else if (x ==4){
		 Proposta tori = new Proposta(); //creo un oggeto 
		float b=tori.base();  //richiede la lunghezza della base o della diagonale minore
                float h=tori.altezza(); //richiede la lunghezza dell'altezza
		 Prototipo triangolo= new Prototipo();
		 float p= triangolo.perimetro(b);
		 float a= triangolo.area(b, h);
		 Risposta risp= new Risposta();
                 risp.risposta (a,p);
		
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
