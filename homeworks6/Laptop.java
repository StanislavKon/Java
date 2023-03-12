package homeworks.homework6;


public class Laptop {
    String name;
    Integer ram;
    Integer ssd;
    String operatingSystem;
    String color;

    public Laptop(String name, Integer ram, Integer ssd, String operatingSystem, String color) {
        this.name = name;
        this.ram = ram;
        this.ssd = ssd;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format(new StringBuilder().append("Модель: %s;\n")
                .append("\tОперативная память RAM, ГБ: %d;\n")
                .append("\tОбъем SSD, ГБ: %d;\n")
                .append("\tОперационная система: %s;\n")
                .append("\tЦвет: %s\n").toString(), name, ram, ssd, operatingSystem, color);
    }

    public boolean compareTo(Laptop other) {
        if (!other.name.equals("") &&
                !this.name.toLowerCase().contains(other.name.toLowerCase())) return false;
        if (!other.color.equals("") &&
                !this.color.equals(other.color)) return false;
        if (!other.operatingSystem.equals("") &&
                !this.operatingSystem.contains(other.operatingSystem)) return false;
        if (other.ram != null &&
                this.ram < other.ram) return false;
        if (other.ssd != null &&
                this.ssd < other.ssd) return false;
        return true;
    }

}