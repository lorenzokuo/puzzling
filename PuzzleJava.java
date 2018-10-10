import java.util.*;
public class PuzzleJava {
	public ArrayList<Integer> printSum(int[] x) {
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		int sum = 0;
		for (int i=0; i<x.length; i++) {
			sum += x[i];
			if (x[i]>10) {
				newArr.add(x[i]);
			}
		}
		System.out.println(sum);
		return newArr;
	}

	public ArrayList<Object> printArr(ArrayList<Object> x) {
		ArrayList<Object> newArr = new ArrayList<Object>();
		Collections.shuffle(x);
		System.out.println(x);

		for (int i=0; i<x.size(); i++) {
			String index = Objects.toString(x.get(i));
			if (index.length() > 5) {
				newArr.add(x.get(i));
			}
		}
		return newArr;
	}
	public void arrLetter(ArrayList<Character> x, ArrayList<Character> v){
		Collections.shuffle(x);
		System.out.println(x.get(x.size()-1));
		// System.out.println(x);
		for (int i=0; i<v.size(); i++) {
			if (x.get(0) == v.get(i)) {
				System.out.println("First letter '" + x.get(0) +"' is Vowel!");
			}
		}
	}
	public void randomNumber() {
		int[] rArr;
		rArr = new int[10];
		Random r = new Random();
		for (int i=0; i<rArr.length; i++) {
			rArr[i] = r.nextInt(100-55);
		}
		System.out.print(Arrays.toString(rArr));

		// Random r = new Random();
		// System.out.println(r.nextInt(5-1));
	}
	public void randomNumber2() {
		int[] rArr;
		int min = 100;
		int max = 0;
		rArr = new int[10];
		Random r = new Random();
		for (int i=0; i<rArr.length; i++) {
			rArr[i] = r.nextInt(100-55)+55;
			if (i>0) {
				if (rArr[i]<min) {
					min = rArr[i];
					// System.out.println("this is min "+min);
				} else if (rArr[i]>max) {
					max = rArr[i];
					// System.out.println("this is max "+max);
				}
			}
		}
		Arrays.sort(rArr);
		System.out.println(Arrays.toString(rArr));
		System.out.println("Min: " + min + ",Max: " + max);
	}
	public void ranNum(ArrayList<Character> x){
		ArrayList<Character> arr = new ArrayList<Character>();
		Random r = new Random();
		for (int i=0; i<5; i++) {
			int j = r.nextInt(25);
			arr.add(x.get(j));
		}
		System.out.println(arr);
		String s1 = Objects.toString(arr.get(0));
		String s2 = Objects.toString(arr.get(1));
		String s3 = Objects.toString(arr.get(2));
		String s4 = Objects.toString(arr.get(3));
		String s5 = Objects.toString(arr.get(4));

		String t1 = s1.concat(s2);
		String t2 = s3.concat(s4);
		String c1 = t1.concat(t2);
		String c2 = c1.concat(s5);

		System.out.println(c2);
	}
}









