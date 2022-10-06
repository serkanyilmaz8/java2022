package oopWithNLayerdApp.Core.logging;

public class DataBaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("veritabanina loglandi" + data);
		
	}

}
