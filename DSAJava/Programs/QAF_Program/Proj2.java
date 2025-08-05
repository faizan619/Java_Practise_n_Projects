public class Proj2{
	public static void main(String[] args) {
		int fruits[] = {4,2,5};
		int buckets[] = {2,5,4};
		int flen = fruits.length;
		int count = flen;
		System.out.println(flen);
		for(int i=0;i<flen;i++){
			for(int j=0;j<flen;j++){
				if(fruits[i] <= buckets[j]){
					count--;
					break;
				}
			}
		}
	}
}