package java03;

public class Pi {

	public static void main(String[] args) {
		double pi = 3.14;
		int r = 12;
		int width=11;
		int height =22;
		double fo = width * height;
		
		
		System.out.println("pi = "+pi+", r = "+r);
		System.out.println("원의 면적!!" + pi*r*r);
		
		System.out.println("");
		
		System.out.println("width = "+width+", height = "+height);
		System.out.println("사각형의 면적!!" + width*height);
		
		System.out.println("");
	
		System.out.println("====================================");
		System.out.println("반지름이 "+pi+"인 원의 면적은 가로가 "+width+", 세로가 "+height+"인 사각형의 면적은");
		System.out.print("가로 세로가 같은가요? ");
		if(width == height) {
			System.out.println("True");			
		}else {
			System.out.println("False");			
		}
		System.out.print("반지름이 10보다 큰가요? ");
		if(r>10) {
			System.out.println("True");
			
		}else {
		System.out.println("False");
		}

		System.out.println("====================================");
	}

}
