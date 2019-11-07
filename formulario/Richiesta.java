	import java.util.*;
	import java.io.*  ;
/*creo un interfeccia per richiedere di quale figura gemetrica si vuole calcolrare il perimetro e l'area. La classe de'interfaccia è come se fosse astratta. le classi contenenti i metodi implementano la classe genitore.*/ 

  abstract class Richiesta{
	float b,h;
	protected abstract  int domanda(); //interfaccia/metodo per chiedere il tipo di figura 
	protected abstract  float base(); //interfacia/metodo per chidere le misure dei lati della figura
	protected abstract  float altezza();
	

}

 
