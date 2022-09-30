package Book3_page235.Chapter04.ProtectingMembers;

public class Ball {
    private double weight;
    protected double getWeight()
    {
        return this.weight;
    }
    protected void setWeight(double weight)
    {
        this.weight = weight;
    }
}
