package tw.satisfaction.myproject.oop.collection;

import java.util.LinkedList;

public class TestQueueWithLinkedListEx1 {

	private LinkedList queue;

	public void processStoreQueue() {
		queue = new LinkedList();
		queue.offer("signal");
		queue.offer("thunder");
	}

	public void processRetriveQueue() {
//		for(int i=0 ; i<queue.size(); i++){
//			String data = (String) queue.poll();
//			System.out.println("data : " + data);
//		}
		
		for(int i=0 ; queue.peek() != null ; ){
			String data = (String) queue.poll();
			System.out.println("data : " + data);
		}
		
//		while (queue.peek() != null) {
//			String data = (String) queue.poll();
//			System.out.println("data : " + data);
//		}
	}

	public static void main(String[] args) {
		TestQueueWithLinkedListEx1 test1 = new TestQueueWithLinkedListEx1();
		test1.processStoreQueue();
		test1.processRetriveQueue();
		System.out.println("test1 : " + test1.queue);


	}

}
