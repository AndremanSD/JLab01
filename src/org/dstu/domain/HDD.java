package org.dstu.domain;

public class HDD extends Device {
    private String rpm;
    private String connface;
    private int buffer = 0;


    public HDD() {
    }

    public HDD(String[] line) {
        super(line[1], Float.parseFloat(line[2]), line[3]);
        rpm = line[4];
        connface = line[5];
        buffer = Integer.parseInt(line[6]);

    }

    public String getInterface() {
        return connface;
    }

    public void setInterface(String connface) {
        this.connface = connface;
    }

    public int getBuffer() {
        return buffer;
    }

    public void setBuffer(int buffer) {
        this.buffer = buffer;
    }

    public String getRpm() {
        return rpm;
    }

    public void setRpm(String rpm) {
        this.rpm = rpm;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Жесткий диск - ");
        builder.append(super.toString());
        builder.append(" | Скорость вращения шпинделя: ");
        builder.append(rpm).append(" оборотов в минуту");
        builder.append(" | Интерфейс подключения: ");
        builder.append(connface);
        builder.append(" | Размер буфера: ");
        builder.append(buffer).append(" КБ");
        return builder.toString();
    }
}
