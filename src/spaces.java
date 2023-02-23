import java.util.Hashtable;

public class spaces {
    public static Hashtable<String, space> init(){
        Hashtable<String, space> h = new Hashtable<>();

        h.put("inside", space.create("in side", new path[] {

                new path("outside", "go outside", new state[]{}),
                new path("basement", "go in the trapdoor", new state[]{new state("trapdoor", "open")}),

        }, new state[]{

                new state("trapdoor", "closed"),

        }, new interaction[]{

                new interaction(
                        new state[]{new state("trapdoor", "closed")},
                        new state[]{new state("trapdoor", "open")}, "open trapdoor"},
                )
        });

        h.put("outside", space.create("out side", new path[] {
                new path("inside", "go inside", new state[]{}),
                new path("road", "go to road", new state[]{}),
        }, new state[]{
                new state("mat","inplace"),
        }, new interaction[]{
                new interaction("mat","inplace",""),
        }));));

        h.put("road", space.create("road", new path[] {
                new path("outside", "go back to yard", new state[]{}),
        }, new state[]{
        }, new interaction[]{
                new interaction("mat","inplace"),
        }));));

        return h;
    }
}
