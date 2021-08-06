package encapsulation;

public class TVRemoteControl implements Controller{

	private boolean turnOn;
	private boolean menu;
	private boolean play;
	private boolean mute;
	private int sound;
	private short channel;
	
	public TVRemoteControl() {
		this.turnOn = false;
		this.menu = false;
		this.play = true;
		this.mute = false;
		this.sound = 20;
		this.channel = 5;		
	}
	
	@Override
	public void turnOnOff() {
		turnOn = !turnOn;
	}

	@Override
	public void openCloseMenu() {
		menu = !menu;
		if(!menu) {
			play = false;
		}
	}

	@Override
	public void turnUpSound() {
		if(mute) {
			mute();
			sound++;
		}
		if(sound < 100) {
			sound++;
		}
	}

	@Override
	public void turnDownSound() {
		if(mute) {
			mute();
			sound--;
		}
		if(sound > 0) {
			sound--;
		}
	}

	@Override
	public void mute() {
		mute = !mute;
		if(mute) {
			sound = 0;
		}
		else {
			sound = 20;
		}
	}

	@Override
	public void playPause() {
		play = !play;
	}

	@Override
	public void channel(short channel) {
		this.channel = channel;
	}

	public short getChannel() {
		return channel;
	}

	public int getSound() {
		return sound;
	}
	
	@Override
	public String toString() {
		if(turnOn) {
			return "Telvision on the channel " + getChannel() + ". The sound is " + getSound() + ".";
		}
		else {
			return "Television ins turned off!";
		}
	}
	
}
