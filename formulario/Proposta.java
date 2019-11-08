	import java.util.*;
	import java.io.*  ;
/*creo una classe con i metodi per chiedere la figura gemetrica di cui si vuole calcolrare il perimetro e l'area.*/ 

 public  class Proposta{
	float b,h,a,p;
	 int x;

       public int domanda()throws IOException{
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader h = new BufferedReader (input) ;             //questo serve a ricevere l'input dalla tastiera e a leggerlo come se fosse una stringa
        System.out.print("Di quale figura vuoi misurare l'area e il perimetro? indica il numero |1 quadrato|2 rombo |3 rettangolo |4 triangolo : ");               // stampa una scritta sul terminale
                                                                // da notare che non è println ma solo print    
        x=Integer.parseInt(h.readLine().trim()); //converto la string in numero 
        return x;
}

 //interfaccia/metodo per chiedere il tipo di figura 
 	 public  float base() throws IOException{
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader h = new BufferedReader (input) ;             //questo serve a ricevere l'input dalla tastiera e a leggerlo come se fosse una stringa
        System.out.print("Quanto misura la base in cm? =>");               // stampa una scritta sul terminale
                                                                // da notare che non è println ma solo print    
        b=Float.parseFloat(h.readLine().trim()); //converto la string in numero 
        return b;
}

	
	 //interfacia/metodo per chidere le misure dei lati della figura
 	public float altezza () throws IOException{
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader g = new BufferedReader (input) ;             //questo serve a ricevere l'input dalla tastiera e a leggerlo come se fosse una stringa
        System.out.print("Quanto misura l'altezza in cm? => ");               // stampa una scritta sul terminale
                                                                // da notare che non è println ma solo print    
        h=Float.parseFloat(g.readLine().trim()); //converto la string in numero 
        return h;
        }

}

 
