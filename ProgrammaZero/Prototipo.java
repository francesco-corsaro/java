class  Prototipo {

        // float b;//base , diagonale maggiore
        //float h; //altezza, diagonale minore
        float a; //area
        float p; //perimetro
        double flag;
	//float l1;//lato 1 per il triangolo isoscele
        //float l2; // lato2 per il triangolo sclaeno

        public float  area (float b, float h){

        a=b*h/2;
        return a;
 }
        public float perimetro(float b){

        p=b*3;
        return p;
        }
 }

