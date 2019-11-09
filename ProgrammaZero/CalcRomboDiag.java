/* Richiede la diagonale maggiore e minore di un rombo e 
calcolcola l'area ed il perimetro */
class CalcRomboDiag{
	public void calcolo (){
		try{
			Proposta tori = new Proposta();
                	Rombo romboObj= new Rombo(); 
                	Risposta risp= new Risposta();
                	double b=tori.diagoMag();  //richiede la lunghezza della diagonale maggiore
                	double h=tori.diagoMin(); //richiede la lunghezza  della diagonale minore
                	double a= romboObj.area(b, h);
                	double p= romboObj.perimetro(b,h);
                	risp.risposta(a,p);
        	}catch (Exception e){

                  System.out.println("non gira");
                  }
	}
}
	
