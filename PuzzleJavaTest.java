import java.util.*;
public class PuzzleJavaTest {
	public static void main(String[] args) {
		PuzzleJava pJ = new PuzzleJava();

		// int[] arr = {3,5,1,2,7,9,8,13,25,32};
		// ArrayList<Integer> result = pJ.printSum(arr);
		// System.out.println(result);

		// ArrayList<Object> arr1 = new ArrayList<Object>(Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));
		// ArrayList<Object> result = pJ.printArr(arr1);
		// System.out.println(result);

		// char[] list = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		// char[] vowel = {'a','e','i','o','u'};

		// ArrayList<Character> x = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
		// ArrayList<Character> v = new ArrayList<Character>(Arrays.asList('a','e','i','o','u'));
		// pJ.arrLetter(x,v);

		// pJ.randomNumber();

		// pJ.randomNumber2();

		ArrayList<Character> x = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
		pJ.ranNum(x);
	}
}