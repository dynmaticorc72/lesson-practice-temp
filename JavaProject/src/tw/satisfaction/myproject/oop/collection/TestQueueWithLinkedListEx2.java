package tw.satisfaction.myproject.oop.collection;

import java.util.LinkedList;

interface ActionQueue {
	public void action();
}

public class TestQueueWithLinkedListEx2 {

	private LinkedList queue;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void processStoreQueue() {
		queue = new LinkedList();
		queue.add(new ActionQueue() {

			public void action() {
				for (int i = 0; i < 10; i++) {

					int num = (int) (Math.random() * 10) + 1;
					System.out.println("num=" + num);
				}
			}

		});
	}

	public void processRetrieveQueue() {
		while (queue.peek() != null) {
			ActionQueue myAction = (ActionQueue) queue.poll();
			myAction.action();
		}
	}

	public static void main(String[] args) {
		TestQueueWithLinkedListEx2 test2 = new TestQueueWithLinkedListEx2();
		test2.processStoreQueue();
		System.out.println("test1 : " + test2.queue);
		test2.processRetrieveQueue();
	}

}
