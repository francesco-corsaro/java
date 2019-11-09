class CalcQuadRett{
	public void calcolo (){
		try {Proposta tori = new Proposta();
                double b=tori.base();  //richiede la lunghezza della base o della diagonale minore
                double h=tori.altezza(); //richiede la lunghezza dell'altezza
                Quadrato quadratoObj = new Quadrato(); //creo un oggetto
                Risposta risp= new Risposta();
                double p=  quadratoObj.perimetro(b,h); //gli dico di utilizzare il metodo perimetro per calcolrare il perimetro
                double a= quadratoObj.area(b,h); //calcolo l'area con il suo metod
                risp.risposta(a,p);    //Stampa la risposta
		} catch (Exception e){

        	  System.out.println("non gira");
		  }

	}
}	
