//creo una classe quadrato
class Quadrato extends Prototipo{
  public float area(float b, float h) {

        a=b*h;
        return a;
 }
	public float perimetro(float b, float h) {
 //       p=b*4;
	 p=(b*2)+(h*2);
         return p;
  }
	/* public void risposta(){
        System.out.println(" L'area è di: => " + a +" Il perimetro è di: =>" + p);
          }*/
}

