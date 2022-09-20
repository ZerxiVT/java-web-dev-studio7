package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    CD() {
        super("CD");
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
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
