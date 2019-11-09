// classse per il rombo quando sono note le diagonali 
 class Rombo extends  Prototipo{
 
        public double perimetro(double dMag, double dMin) {
        
	double dp1=dMag/2;
        double dp2=dMin/2;
        double dp11=Math.pow(dp1,2);
	double dp22=Math.pow(dp2,2);
	double sum= dp11+dp22;
	double rdq=Math.sqrt(sum);
//	double r=Float.parseFloat(rdq.readLine().trim());
	
	double p= rdq*4;
//	flag=(Math.sqrt(Math.pow(dp1,2)))+(Math.sqrt(Math.pow(dp2,2)));
//	flag=flag*4;
//        p=Float.parseFloat(r.readLine().trim());
        return p;
	}
}

