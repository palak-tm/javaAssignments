package assignments;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author Palak Tiwari Implement method to perform operations on queue
 */
public class Queue {
	/* array of queue stores the elements on different positions */
	private int[] queueArr;
	/* front stores the value of front side of queue */
	private int front;
	/* rear stores the value of rear side of queue */
	private int rear;
	/* size stores the size of an array */
	private int size;
	/* length stores the length of an array */
	private int length;

	public Queue(int capacity) {
     	this.queueArr = new int[capacity];
		this.front = -1;
		this.rear = -1;
		this.length = 0;
		this.size = capacity;
	}

	/**
	 * @return Method is used to check whether queue is empty It will return either
	 * true or false boolean value
	 */
	public boolean isQueueEmpty() {
		return front == -1;
	}

	/**
	 * @return Method is used to check whether queue is full It will return either
	 * true or false boolean value
	 */
	public boolean isQueueFull() {
		return front == 0 && rear == size - 1;
	}

	/**
	 * @param item
	 * Method is used to insert element in queue throw
	 * {@link IndexOutOfBoundsException} when queue is full
	 */
	public void add(int item) {
		if (rear == -1) {
			front = 0;
			rear = 0;
			queueArr[rear] = item;
		} else if (rear + 1 >= size)
			throw new IndexOutOfBoundsException("Overflow Exception");
		else if (rear + 1 < size)
			queueArr[++rear] = item;
		length++;
	}

	/**
	 * @return Method is used to delete elements from queue throw
	 * {@link NoSuchElementException} when queue is empty
	 */
	public int delete() {
		if (isQueueEmpty())
			throw new NoSuchElementException("Underflow Exception");
		else {
			length--;
			int element = queueArr[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else
				front++;
			return element;
		}
	}

	/**
	 * Method is used to display all the elements of queue when queue is not empty
	 * else it will return
	 */
	public void display() {
		System.out.print("\nQueue is:  ");
		if (length == 0) {
			System.out.print("Empty\n");
			return;
		}
		for (int i = front; i <= rear; i++)
			System.out.print(queueArr[i] + " ");
		System.out.println();
	}
}

/**
 * @author Palak Tiwari performs operations on queue according to the user choice
 */
class QueueImplement {
	/* main method to perform the operations on queue */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of Queue ");
		/* size stores the size of the queue */
		int size = scanner.nextInt();
		/* creating object of class Queue */
		Queue queue = new Queue(size);
		/*
		 * value stores the value entered by user to continue to perform operations or
		 * not
		 */
		char value;
		do {
			System.out.println("\nQueue Operations");
			System.out.println("1. Add");
			System.out.println("2. Delete");
			System.out.println("3. check Queue empty");
			System.out.println("4. check Queue full");
			System.out.println("5. Display Queue");
			/* stores the choice entered by user */
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to insert");
				try {
					/* calls add method to insert elements in queue */
					queue.add(scanner.nextInt());
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 2:
				try {
					/* calls delete method to delete elements from queue */
					System.out.println("Removed Element is " + queue.delete());
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 3:
				/*
				 * calls isQueueEmpty method returns true if queue is empty else returns false
				 */
				System.out.println("The queue is empty " + queue.isQueueEmpty());
				break;
			case 4:
				/* calls isQueueFull method returns true if queue is full else returns false */
				System.out.println("The queue is full " + queue.isQueueFull());
				break;
			case 5:
				/* calls display method to display the elements in queue */
				queue.display();
				break;
			default:
				System.out.println("Invalid Input \n ");
				break;
			}
			System.out.println("\nDo you want to continue (Type y or n) \n");
			value = scanner.next().charAt(0);
			scanner.close();
		} while (value == 'Y' || value == 'y');
	}
}
