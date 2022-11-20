package JavaFundamentalsCoding19.Task19;

public class Poem {
    private Author creator; //HAS-A
    private int stropheNumber;

    public Poem() { }

    public Poem(Author creator, int stropheNumber) {
        this.creator = creator;
        this.stropheNumber = stropheNumber;
    }

    public Author getCreator() {
        return creator;
    }

    public void setCreator(Author creator) {
        this.creator = creator;
    }

    public int getStropheNumber() {
        return stropheNumber;
    }

    public void setStropheNumber(int stropheNumber) {
        this.stropheNumber = stropheNumber;
    }

    @Override
    public String toString() {
        return "Poem{" +
                "creator=" + creator +
                ", stropheNumber=" + stropheNumber +
                '}';
    }
}
