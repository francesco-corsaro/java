class  Prototipo {

        // float b;//base , diagonale maggiore
        //float h; //altezza, diagonale minore
        double a; //area
        double p; //perimetro
        double flag;
	//float l1;//lato 1 per il triangolo isoscele
        //float l2; // lato2 per il triangolo sclaeno

        public double  area (double b, double h){

        a=b*h/2;
        return a;
 }
        public double perimetro(double b){

        p=b*3;
        return p;
        }
 }

