package squares;

public class squares_main {
	
	public static void main(String[] args){
		
	double x[] = { 0.0, 0.2, 0.4, 0.6, 0.8, 1.0, 1.2 };
	double y[] = { 3.6, 4.5, 0.3, 4.5, 1.2, 6.3, 7.8 };
	double theta[] = new double[2];
    int i;
	
	squares_lib slib = new squares_lib(x, y);

	for(i = 0; i < 100; i++){
		 theta = slib.getDx();
	}
		 System.out.println(i+" : theta[0] = "+theta[0]);
		 System.out.println(i+" : theta[1] = "+theta[1]);
		 System.out.println(i+" : Objective function = "+slib.getRx());
     }
}
//y = 3.0536x + 2.1964