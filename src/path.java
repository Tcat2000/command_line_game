public class path {
    public String to;
    public String text;
    public state[] conditions;

    public path(String To, String Text, state[] Conditions){
        to = To;
        text = Text;
        conditions = Conditions;
    }
}
