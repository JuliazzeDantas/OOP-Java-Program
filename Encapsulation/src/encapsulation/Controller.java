package encapsulation;

public interface Controller {
	
	public abstract void turnOnOff();
	public abstract void openCloseMenu();
	public abstract void turnUpSound();
	public abstract void turnDownSound();
	public abstract void mute();
	public abstract void playPause();
	public abstract void channel(short channel);
	
}
