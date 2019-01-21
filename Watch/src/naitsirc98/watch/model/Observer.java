package naitsirc98.watch.model;

public interface Observer<T extends Observable> {
	
	void notify(T observable);

}
