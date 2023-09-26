package package3;

public abstract class PhoneCameraApp {
	PhotoShareMethod shareMethod;
	
	public void takePhoto() {
		System.out.println("Take photo");
	}
	public abstract void editPhoto();
	public void savePhoto() {
		System.out.println("save photo");
	}
	public void sharePhoto(PhotoShareMethod shareByText) {
		shareMethod = shareByText;
		shareMethod.sharePhoto();
	}
	
}
