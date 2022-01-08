package classes;

public class Seed {
    String name;
    public Seed(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    private boolean isGrown;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String d) {
        description = d;
    }

    public boolean getStatus() {
        return isGrown;
    }

    public void setStatus(boolean b) {
        isGrown = b;
    }

    {
        if (TimeOfDay.Dusk.getStatus()) {
            setStatus(true);
            setDescription(" проросла за сутки");
        }
        else setDescription(" не проросла");
    }
}
