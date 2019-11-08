class Programma{
	int x;
	public static void main (String[] args)  {
	Proposta figura= new Proposta(); //creo un oggeto 
		
	try {
    	 int x=figura.domanda();
	float b=figura.base();
	float h=figura.altezza();
	 switch (x){
		case 1:
		Quadrato quadratoObj = new Quadrato();
		float p= quadratoObj.perimetro(b);
		float a= quadratoObj.area(b);
		System.out.println(" L'area è di: => " + a +" Il perimetro è di: =>" + p);
	  }
      } catch (Exception e){

	System.out.println("non gira");
      } 	
	/*finally{
	System.out.pri
     }  */
    } 
   }
