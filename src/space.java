public class space {
    String name;
    public path[] paths;
    public state[] states;
    public interaction[] interactions;

    public static space create(String Name, path[] Paths, state[] States, interaction[] Interactions){
        space s = new space();
        s.name = Name;
        s.paths = Paths;
        s.states = States;
        s.interactions = Interactions;

        return s;
    }
}
