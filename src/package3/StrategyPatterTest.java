package package3;

public class StrategyPatterTest {

	public static void main(String[] args) {
		PhoneCameraApp basicApp = new BasicCameraApp();
		basicApp.takePhoto();
		basicApp.editPhoto();
		basicApp.savePhoto();
		basicApp.sharePhoto(new ShareByText());
		
		PhoneCameraApp plusApp = new CameraPlusApp();
		plusApp.takePhoto();
		plusApp.editPhoto();
		plusApp.savePhoto();
		plusApp.sharePhoto(new ShareByEmail());
	}
}
