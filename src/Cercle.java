public class Cercle extends Figure {
    private double rayon;
    private Point centre;

    public Cercle(double rayon, Point centre) {
        this.rayon = rayon;
        this.centre = centre;
    }
    @Override
    public double perimettre() {
        return 0;
    }

    @Override
    public double surface() {
        return 0;
    }

    @Override
    public void dessiner() {

    }
}
