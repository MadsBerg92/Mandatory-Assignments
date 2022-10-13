import java.util.ArrayList;

public class Forest {

    private ArrayList<Tree> trees;

    public Forest() {

        trees = new ArrayList<>();
    }

    public void addTree(int g) {

        trees.add(new Tree(g));

    }

    public String toString() {
        String k = "";

        for (int i = 0; i < trees.size(); i++) {
            k += trees.get(i).toString();
        }
        return "Forest(" + k + ")";

    }

    public void growOneYear() {

        for (Tree trees : trees) {
            trees.growOneYear();

        }

    }

}
