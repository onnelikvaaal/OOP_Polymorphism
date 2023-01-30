public enum LoadCapacity {

    N1(null, 3.5F),
    N2(3.5F, 12F),
    N3(12F, null);


    private Float lowerLoadLimit;
    private Float upperLoadLimit;

    private LoadCapacity(Float lowerLoadLimit, Float upperLoadLimit) {
        this.lowerLoadLimit = lowerLoadLimit;
        this.upperLoadLimit = upperLoadLimit;
    }

    @Override
    public String toString() {
        String lowerLimit = "";
        String upperLimit = "";
        if (lowerLoadLimit != null) {
            lowerLimit = " от " + lowerLoadLimit + " тонн";
        }
        if (upperLoadLimit != null) {
            upperLimit = " до " + upperLoadLimit + " тонн";
        }
        return "Грузоподъёмность" + lowerLimit + upperLimit;
    }

}
