//creo una classe quadrato
class Quadrato extends Prototipo{
  public double area(double b, double h) {

        a=b*h;
        return a;
 }
	public  double perimetro( double b,  double h) {
 //       p=b*4
	 b*=2;
	 h*=2;
	 p=b+h;
         return p;
  }
	/* public void risposta(){
        System.out.println(" L'area è di: => " + a +" Il perimetro è di: =>" + p);
          }*/
}

