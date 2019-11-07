//classe per l'altezza
     class Form3 extends Richiesta{
       
        abstract float altezza () throws IOException{
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader g = new BufferedReader (input) ;             //questo serve a ricevere l'input dalla tastiera e a leggerlo come se fosse una stringa
        System.out.print("Quanto misura la base?");               // stampa una scritta sul terminale
                                                                // da notare che non è println ma solo print    
        h=Float.parsFloat(g.readLine().trim()); //converto la string in numero che indica di quale figuar a si tratta
        return h;
	}
    }  
