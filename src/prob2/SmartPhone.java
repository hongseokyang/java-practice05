package prob2;

public class SmartPhone extends MusicPhone {
	public void excute (String function) {
		if(function.equals("앱")) {
			playApp();
			return;
		}
		
		super.execute(function);
	}
	
	@Override
	protected void playMusic() {
		System.out.println( "다운로드해서 음악 재생" );
	}
	
	protected void playApp() {
		System.out.println("앱실행");
	}
}
