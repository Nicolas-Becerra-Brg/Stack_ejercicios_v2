
public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		program b = new program();
		
		
		System.out.println(b.esPalindromo("Anita lava lae tena"));

	}
		public void invertirCadena(String myString) {
			String[] words = myString.split("");
			My_stack temp = new My_stack(words.length);
			int contador = 0;
			for(int i = words.length-1; i >= 0; i--) {
				temp.push(myString.charAt(i));
				System.out.print(temp.stack[contador]);
				contador++;
			}
			
			
		}
		public boolean esPalindromo(String myString) {
			String minuscula = myString.toLowerCase();
			String todoJunto = minuscula.replace(" ", "");
			String[] words = myString.split("");
			My_stack temp = new My_stack(words.length);
			for(int i = words.length-1; i >= 0; i--) {
				temp.push(myString.charAt(i));
			}
			String invert = String.valueOf(temp.stack);
			String minuscula1 = invert.toLowerCase();
			String todoJunto1 = minuscula1.replace(" ", "");
			Boolean result = todoJunto1.equals(todoJunto);
			return result;
		}
			
		
	}

