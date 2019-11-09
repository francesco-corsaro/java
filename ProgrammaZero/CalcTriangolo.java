class CalcTriangolo{
  public void calcolo (){
                try {
			Proposta tori = new Proposta(); //creo un oggeto 
             		double b=tori.base();  //richiede la lunghezza della base 
                	double h=tori.altezza(); //richiede la lunghezza dell'altezza
                	Prototipo triangolo= new Prototipo();
                	double p= triangolo.perimetro(b);
                	double a= triangolo.area(b, h);
                 	Risposta risp= new Risposta();
                 	risp.risposta (a,p);

		} catch (Exception e){

                  System.out.println("non gira");
                  }

        }


}
