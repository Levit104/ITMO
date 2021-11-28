public abstract class Human implements Emotional, Actionable {
    String Name;

    @Override
    public int hashCode() {
        return this.Name.hashCode();
    }
    @Override
    public String toString() {
        return this.Name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) return false;
        Human others = (Human) obj;
        return this.Name == others.Name;
    }

}
