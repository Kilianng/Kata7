package naitsirc98.watch.gui;

import naitsirc98.watch.model.Observer;
import naitsirc98.watch.model.Watch;

public class WatchPresenter implements Observer<Watch> {

	private Watch watch;
	private WatchView view;
	
	public WatchPresenter(Watch watch, WatchView view) {
		this.watch = watch;
		this.view = view;
		watch.addObserver(this);
	}


	@Override
	public void notify(Watch observable) {
		view.render(watch.getTime());
	}
	
	
	
}
