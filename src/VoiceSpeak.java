import com.sun.speech.freetts.VoiceManager;

class Voice{
String name;
com.sun.speech.freetts.Voice voice;

void Voice(String name)
{
    this.name=name;
    this.voice=VoiceManager.getInstance().getVoice(this.name);
    this .voice.allocate();
    this.voice.setPitchRange(20);
    this.voice.setRate(160);
}
public void say(String Something)
{
    this.voice.speak(Something);
}

}
