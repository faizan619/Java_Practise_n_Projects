package base;

public class Record{
	int num = 0;
	String allTopics[] = new String[100];
	public void topic(String title){
		allTopics[num] = title;
		num++;
		System.out.println("------------------- [ "+num+" ] - "+title+"-------------------");
	}

	public void getResult(){
		System.out.println("Total Topic Learn : "+num);
		for(String name:allTopics){
			if(name!= null){
				System.out.println("Topic : "+name);
			}
		}
		// for(int i=0;i<allTopics.length;i++){
		// 	System.out.println("Topic : "+allTopics[i]);
		// }
	}
}