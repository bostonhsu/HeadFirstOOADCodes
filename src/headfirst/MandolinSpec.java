package headfirst;

/**
 * Created by Administrator on 2017/7/6.
 */
public class MandolinSpec extends InstrumentSpec {
    public Style getStyle() {
        return style;
    }

    private Style style;

    public MandolinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Style style) {
        super (builder, model, type, backWood, topWood);
        this.style = style;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches (otherSpec))
            return false;
        if (!(otherSpec instanceof MandolinSpec))
            return false;
        MandolinSpec spec = (MandolinSpec)otherSpec;
        if (!style.equals (spec.style))
            return false;
        return true;
    }
}
