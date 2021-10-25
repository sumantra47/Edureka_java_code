package assignment;

public class QueueClass implements Queue {

	String[] arr = new String[5];
	int count;

	@Override
	public void insert(String in) {
		if (this.count < this.arr.length) {
			this.arr[this.count] = in;
			this.count += 1;
			//System.out.println(count);
		} else {
			System.out.println("Array is Full");
		}

	}

	@Override
	public void delete(String x) {
		if (this.count > 0) {
			for (int i = 0; i < this.count; i++) {
				if (this.arr[i].equals(x)) {
					arr[i] = (String) null;
					count -= 1;
					break;
				} else {
					System.out.println(x + "Is not present");
				}
			}
			//System.out.println(count);

		} else {
			System.out.println("Array is Empty");
		}

	}

}
