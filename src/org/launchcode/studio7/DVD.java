package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    DVD() {
        super("DVD");
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void writeData(String contents) {
        this.contents = contents;
        System.out.println(discType + " contents: " + contents);
    }

    @Override
    public void readData() {
        System.out.println(discType + " contents: " + contents);
    }
}
