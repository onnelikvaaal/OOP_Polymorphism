public enum CarBody {
    SEDAN("Седан"),
    HATCHBACK("Хэтчбэк"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн"),
    JEEP("Джип");


    private String carBodyType;

    CarBody(String carBodyType) {
        this.carBodyType = carBodyType;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + carBodyType;
    }

}
