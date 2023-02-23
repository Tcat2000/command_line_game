public class interaction {
    state[] conditions;
    state[] effects;
    String text;

    public interaction(state[] Conditions, state[] Effects, String Text){
        conditions = Conditions;
        effects = Effects;
        text = Text;
    }
}
