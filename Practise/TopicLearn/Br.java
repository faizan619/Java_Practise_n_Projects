package TopicLearn;

public class Br{
	int num = 0;
	String topics[] = new String[100];

	public void seperate(String topic){

		topics[num] = topic;

		num++;

		System.out.println();
		System.out.println("=====================["+num+" - "+topic+" ]=====================");
		System.out.println();
	}

	public void totalTopicLearn(){
		seperate("Total Topic Learn");
		// System.out.println();
		for(int i=0;i<num;i++){
			System.out.println((i+1)+" - "+topics[i]);
		}
	}
}
