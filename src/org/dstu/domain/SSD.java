package org.dstu.domain;

public class SSD extends Device {
    private String controller;
    private String memtype;
    private int readSpeed = 0;
    private int writeSpeed = 0;


    public SSD() {
    }

    public SSD(String[] line) {
        super(line[1], Float.parseFloat(line[2]), line[3]);
        controller = line[4];
        memtype = line[5];
        readSpeed = Integer.parseInt(line[6]);
        writeSpeed = Integer.parseInt(line[7]);

    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getMemtype() { return memtype; }

    public void setMemtype(String memtype) { this.memtype = memtype; }

    public int getReadSpeed() { return readSpeed; }

    public void setReadSpeed(Integer readSpeed) {
        this.readSpeed = readSpeed;
    }

    public int getWriteSpeed() { return writeSpeed; }

    public void setWriteSpeed(Integer writeSpeed) {
        this.writeSpeed = writeSpeed;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Твердотельный накопитель - ");
        builder.append(super.toString());
        builder.append(" | Контроллер: ");
        builder.append(controller);
        builder.append(" | Тип памяти: ");
        builder.append(memtype);
        builder.append(" | Скорость чтения: ");
        builder.append("до ").append(readSpeed).append(" МБ/с");
        builder.append(" | Скорость записи: ");
        builder.append("до ").append(readSpeed).append(" МБ/с");
        return builder.toString();
    }
}
