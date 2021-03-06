package com.bzsomi;

public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengeseg;

    public Bosszuallo(double szuperero, boolean vanEGyengeseg) {
        this.szuperero = szuperero;
        this.vanEGyengeseg = vanEGyengeseg;
    }

    public abstract boolean megmentiAVilagot();

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public double getSzuperero() {
        return szuperero;
    }

    @Override
    public boolean legyoziE(Szuperhos hos) {
        return this.vanEGyengeseg && this.szuperero < hos.mekkoraAzEreje();
    }

    @Override
    public double mekkoraAzEreje() {
        return this.szuperero;
    }

    @Override
    public String toString() {
        return String.format("bosszúálló:\nSZUPERERŐ: %.5f\nGYENGESÉG %sismert", this.szuperero, this.vanEGyengeseg ? "" : "nem ");
    }
}
