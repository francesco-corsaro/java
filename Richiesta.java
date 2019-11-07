import java.util.*;
import java.io.*  ;
/*creo un interfeccia per richiedere di quale figura gemetrica si vuole calcolrare il perimetro e l'area. La classe de'interfaccia è come se fosse astratta. le classi contenenti i metodi implementano la classe genitore.*/ 

	interface Richiesta{
	public int domanda(); //interfeccia/metodo per chiedere il tipo di figura 
	public float base(); //interfacia/metodo per chidere le misure dei lati della figura
	public float altezza();
}

// classe per richiesta figura che implemtenta Richiesta
	abstract class Form1 implements Richiesta {
	int x;
	public int domanda()throws IOException{
	InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader h = new BufferedReader (input) ;             //questo serve a ricevere l'input dalla tastiera e a leggerlo come se fosse una stringa
        System.out.print("Di quale figura vuoi misurare l'area e il perimetro? indica il numero |1 quadrato|2 rombo |3 rettangolo |4 triangolo");               // stampa una scritta sul terminale
                                                                // da notare che non è println ma solo print    
        x=Integer.parseInt(h.readLine().trim()); //converto la string in numero che indica di quale figuar a si tratta
	return x;
}
}

//classe per richiesta della base

	abstract class Form2 implements Richiesta{
	float b;
        public float base () throws IOException{
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader h = new BufferedReader (input) ;             //questo serve a ricevere l'input dalla tastiera e a leggerlo come se fosse una stringa
        System.out.print("Quanto misura la base?");               // stampa una scritta sul terminale
                                                                // da notare che non è println ma solo print    
        b=Float.parseFloat(h.readLine().trim()); //converto la string in numero che indica di quale figuar a si tratta
	return b;
}
}

//classe per l'altezza
	abstract class Form3 implements Richiesta{
        float h;
        public float altezza () throws IOException{
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader g = new BufferedReader (input) ;             //questo serve a ricevere l'input dalla tastiera e a leggerlo come se fosse una stringa
        System.out.print("Quanto misura la base?");               // stampa una scritta sul terminale
                                                                // da notare che non è println ma solo print    
        h=Float.parsFloat(g.readLine().trim()); //converto la string in numero che indica di quale figuar a si tratta
	return h;
}	
}


