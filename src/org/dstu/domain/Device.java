package org.dstu.domain;

public abstract class Device implements IDevice {
    private String name;
    private Float capacity = 0.0F;
    private String inch;

    public Device() {
    }

    public Device(String name, Float capacity, String inch) {
        this.name = name;
        this.capacity = capacity;
        this.inch = inch;
    }

    public Device(String[] line) {
        name = line[1];
        capacity = Float.parseFloat(line[2]);;
        inch = line[3];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getCapacity() {
        return capacity;
    }

    public void setCapacity(Float capacity) {
        this.capacity = capacity;
    }

    public String getSize() {
        return inch;
    }

    public void setSize(String inch) {
        this.inch = inch;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Наименование: ");
        builder.append(name);
        builder.append(" | Емкость накопителя: ");
        if (capacity >= 1000) {
            StringBuilder append = builder.append(capacity / 1000).append(" ТБ");
        } else builder.append(capacity).append(" ГБ");
        builder.append(" | Форм-фактор: ");
        builder.append(inch);
        return builder.toString();
    }
}
