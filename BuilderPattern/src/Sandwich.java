public class Sandwich {
    private String bread;
    private String filling;
    private String accompaniment;

    public void setBread(String bread) { this.bread = bread; }
    public void setFilling(String filling) { this.filling = filling; }
    public void setAccompaniment(String accompaniment) { this.accompaniment = accompaniment; }

    @Override
    public String toString() {
        return "Sandwich with " + bread + ", " + filling + ", and " + accompaniment;
    }
}
