public class Proj6{
	public static void main(String[] args) {
		String name = "abbcccddddeeeee";
		makeFancy(name);
		// String res = makeFancy(name);
		// System.out.println(res);
	}

	static void makeFancy(String s){
		StringBuilder sb = new StringBuilder(s);
        int slen = sb.length();
        int count = 0;
        int i =0;
        while(i<slen-2){
            char curr = sb.charAt(i);
            System.out.println("curr : "+curr+" | i = "+i+" | count : "+count+" | slen ="+slen);
            int j=i+1;
            while(j<slen && sb.charAt(j) == curr){
                count++;
                j++;
            }
            System.out.println("Count : "+count);
            if(count>=2){
                sb.delete(i+1,i+count);
                slen = slen - (count-1);
            }
            count = 0;
            i++;
            System.out.println(sb);
        }
        // return sb.toString();

	}
}