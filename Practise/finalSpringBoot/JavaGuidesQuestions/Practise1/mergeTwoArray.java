import java.util.ArrayList;

public class mergeTwoArray{
	public static void main(String[] args) {
		System.out.println("Merge Two Arrays");

		String a1[] = {"apple","mango","banana","grapes"};
		String a2[] = {"mobile","laptop","book","keyboard"};

		String a3[] = new String[a1.length+a2.length];

// System.arraycopy(sourceArray, sourcePos, destArray, destPos, length);
// | Parameter     | Meaning                                                                                                          |
// | ------------- | ---------------------------------------------------------------------------------------------------------------- |
// | `sourceArray` | The array you are copying from (`a1` here).                                                                      |
// | `sourcePos`   | Index in the source array to start copying (`0` here, meaning start from the first element).                     |
// | `destArray`   | The array you are copying to (`a3` here).                                                                        |
// | `destPos`     | Index in the destination array to start placing copied elements (`0` here, meaning fill from the first element). |
// | `length`      | Number of elements to copy (`a1.length` here, meaning copy all elements).                                        |

		System.arraycopy(a1,0,a3,0,a1.length);
		System.arraycopy(a2,0,a3,a1.length,a2.length);

		for(String m:a3){
			System.out.println("Array : "+m);
		}

	}
}