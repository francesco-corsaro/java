class Programma{
	int x;
	public static void main (String[] args)  {
	Proposta figura= new Proposta(); //creo un oggeto 
		
	try {
    	 int x=figura.domanda();
	  System.out.println("il num della figura selezionata è: "+  x);
      } catch (Exception e){
	System.out.println("non gira");
      } 	
	/*finally{
	System.out.pri
     }  */
    } 
   }
