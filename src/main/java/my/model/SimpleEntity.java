package my.model;

public class SimpleEntity {
    public String name;
    public String value;

    @Override
    public String toString() {
        return "SimpleEntity(" + name + ", " + value + ")";
    }
}
