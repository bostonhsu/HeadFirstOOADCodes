package headsecond;

/**
 * Created by Administrator on 2017/7/4.
 */
public class Bark {
    private String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public boolean equals(Object bark) {
        return sound.equals (((Bark)bark).getSound ());
    }
}
