package headfirst;

/**
 * Created by Administrator on 2017/6/26.
 */
public enum Type {
    ACOUSTIC, ELECTRIC;

    public String toString() {
        switch (this) {
            case ACOUSTIC:
                return "Acoustic";
            case ELECTRIC:
                return "Electric";
                default:
                    return "null";
        }
    }
}
