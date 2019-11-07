  import java.util.*;
  import java.io.*  ;
  
//classe per richiesta della base


        class Form2 extends  Richiesta{
        
       	public  float base() throws IOException{
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader h = new BufferedReader (input) ;             //questo serve a ricevere l'input dalla tastiera e a leggerlo come se fosse una stringa
        System.out.print("Quanto misura la base?");               // stampa una scritta sul terminale
                                                                // da notare che non è println ma solo print    
        b=Float.parseFloat(h.readLine().trim()); //converto la string in numero che indica di quale figuar a si tratta
        return b;
}
}

