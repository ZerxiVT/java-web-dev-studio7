package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        CD newCD = new CD();
        DVD newDVD = new DVD();

        newCD.insertDisc();
        newCD.loadDisc("Avatar soundtrack", 100);
        newCD.spinDisc();
        newCD.writeData("Pandora");
        newCD.readData();
        newCD.ejectDisc();

        newDVD.insertDisc();
        newDVD.loadDisc("Avatar", 100);
        newDVD.spinDisc();
        newDVD.writeData("Out there beyond that fence every living thing that crawls, flies, or squats in the mud wants to kill you and eat your eyes for jujubes. We have an indigenous population of humanoids called the Navi. They're fond of arrows dipped in a neurotoxin that will stop your heart in one minute");
        newDVD.readData();
        newDVD.ejectDisc();
    }
}
