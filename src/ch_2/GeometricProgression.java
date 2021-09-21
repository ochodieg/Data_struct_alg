package ch_2;

public class GeometricProgression extends Progression {
    // additional instance variables
    protected long multiplier;

    // Constructors



    // starting with the most specified one...
    public GeometricProgression(long m, long start) {
        super(start);
        multiplier = m;
    }

    // defaults
    public GeometricProgression(long m) { this(m,1); } // neutral value for multiplication is 1
    public GeometricProgression() { this(2,1); }


    // Override super method
    protected void advance() { current *= multiplier; }

}