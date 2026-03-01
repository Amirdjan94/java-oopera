package data;

public enum Scenario {
    CRIME_AND_PUNISHMENT ("Преступление и наказание", "Молодой человек, исключённый из студентов университета… решился убить одну старуху"),
    CARMEN ("Кармен", "Сюжет оперы Ж. Бизе «Кармен» взят из одноименного романа П. Мериме"),
    SWAN_LAKE ("Лебединое озеро", "Вступление в новую жизнь, в мир ратных дел, мужественных свершений и в то же время — отказ от юношеских увлечений и беззаботной жизни.");

    private String nameOfShow;
    private String libretto;

    private Scenario(String nameOfShow, String libretto) {
        this.nameOfShow = nameOfShow;
        this.libretto = libretto;
    }

    public String getLibretto() {
        return libretto;
    }

    public String getNameOfShow() {
        return nameOfShow;
    }
}
