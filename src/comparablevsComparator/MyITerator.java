package comparablevsComparator;

import java.util.function.Consumer;

public class MyITerator<T> implements Consumer<T>{


	@Override
	public void accept(T arg0) {
		// TODO Auto-generated method stub
		
		System.out.println(arg0);
	}

}
