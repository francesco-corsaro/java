/*creare un programma che permette di inserire due  numeri 
 dalla tastiera, fare la somma, e stampare il risultato */

import java.io.*  ; // con questo pacchetto posso inserire input da tastiera?

public class Somma {

	public static void main (String[] args) throws IOException {    //throws permette di "sollevare" il programmatore da eventeuali eccezioni (errori)
	int x,y,r;
	InputStreamReader input= new InputStreamReader(System.in);
	BufferedReader h = new BufferedReader (input) ;             //questo serve a ricevere l'input dalla tastiera e a leggerlo come se fosse una stringa
	System.out.print("inserisci un valore:");               // stampa una scritta sul terminale che dice inserire x
								// da notare che non è println ma solo print	
	x=Integer.parseInt(h.readLine().trim()); //converto la stringa in intero e tolgo eventuali spazi con la funzione trim()
	
	System.out.print("inserisci il secondo valore:");
	y=Integer.parseInt(h.readLine().trim()); //faccio la stessa con la variabile y
	r = x+y; //finalmente faccio la somma delle due variabili e la stampo
	System.out.println("Il risultato è:" + r);
	} //termino la funzione principale
}//termino la classe
