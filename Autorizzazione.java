/* Creare un programma che prevede di inserire tramite tastiera l'età 
   verificare se è maggiore di 18 anni, stampare a video "accesso permmesso" nel caso maggiore o uguale 18, e "accesso negato" se l'età è inferiore a 18 */

import java.io.*;
public class Autorizzazione{
	/*public void check (int y){
	if (y < 18){
		System.out.println("Permesso negato"); //scrivo un controllo per il quale se l'età inserita è inferiore a 18 compare permesso negato
		}else{	System.out.println("Benvenuto");
		}
	}qui finisce il metodo check*/
	 public static void main (String[] args) throws IOException {
	int b;
	InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader h = new BufferedReader (input) ;
	System.out.print("Quanti anni hai?");
	b=Integer.parseInt(h.readLine().trim()); //converto la stringa in intero e tolgo eventuali spazi con la funzione trim()
	if (b<18){
	System.out.println("Accesso negato");
	}else{ System.out.println(" Benvenuto");
	}
}
}

