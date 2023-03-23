package HomeWorks.HomeWork6;

import java.util.Objects;

public class Notebook {
    private String manufacturer;
    private Float diagonal;
    private String cpu;
    private String os;
    private Integer ram;
    private Integer ssd;

    public Notebook(String Manufacturer, Float Diagonal, String CPU, String OS, Integer RAM, Integer SSD) {
        this.manufacturer = Manufacturer;
        this.diagonal = Diagonal;
        this.cpu = CPU;
        this.os = OS;
        this.ram = RAM;
        this.ssd = SSD;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.manufacturer = Manufacturer;
    }

    public Float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Float Diagonal) {
        this.diagonal = Diagonal;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String CPU) {
        this.cpu = CPU;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String OS) {
        this.os = OS;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer RAM) {
        this.ram = RAM;
    }

    public Integer getSsd() {
        return ssd;
    }

    public void setSsd(Integer SSD) {
        this.ssd = SSD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(manufacturer, notebook.manufacturer) && Objects.equals(diagonal, notebook.diagonal) && Objects.equals(cpu, notebook.cpu) && Objects.equals(os, notebook.os) && Objects.equals(ram, notebook.ram) && Objects.equals(ssd, notebook.ssd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, diagonal, cpu, os, ram, ssd);
    }

    @Override
    public String toString() {
        return "Notebook " +
                "firmName='" + manufacturer + '\'' +
                ", diagonal=" + diagonal +
                ", cpu='" + cpu + '\'' +
                ", os='" + os + '\'' +
                ", ram=" + ram + "Gb" +
                ", ssd=" + ssd + "Gb";
    }
}

