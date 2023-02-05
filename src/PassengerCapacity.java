public enum PassengerCapacity {

    /*особо малая (до 10 мест);
    малая (до 25);
    средняя (40–50);
    большая (60–80);
    особо большая (100–120 мест).*/

    XS (null, 10),
    S (null, 25),
    M (40, 50),
    L (60, 80),
    XL (100, 120);

    private Integer lowerSeatsLimit;
    private Integer upperSeatsLimit;

    private PassengerCapacity(Integer lowerSeatsLimit, Integer upperSeatsLimit) {
        this.lowerSeatsLimit = lowerSeatsLimit;
        this.upperSeatsLimit = upperSeatsLimit;
    }

    public String toString() {
        String lowerLimit = "";
        String upperLimit = "";
        if (lowerSeatsLimit != null) {
            lowerLimit = " от " + lowerSeatsLimit + " мест";
        }
        if (upperSeatsLimit != null) {
            upperLimit = " до " + upperSeatsLimit + " мест";
        }
        return "Вместимость" + lowerLimit + upperLimit;
    }
}
