public abstract class Human implements Emotional, Actionable {
    String name;

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) return false;
        Human others = (Human) obj;
        //return this.name == others.name;
        return this.hashCode() == others.hashCode();
    }
}
