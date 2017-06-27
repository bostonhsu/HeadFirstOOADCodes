package headfirst;

/**
 * Created by Administrator on 2017/6/26.
 */
public class GuitarSpec {
    private Builder builder;
    private Type type;
    private Wood backWood, topWood;
    private String model;


    private int numStrings;

    public GuitarSpec(Builder builder, Type type, Wood backWood, Wood topWood, String model, int numStrings) {
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.model = model;
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public String getModel() {
        return model;
    }
}
