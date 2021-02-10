package solid.dip.devices.nonCompliant;

import static solid.dip.devices.nonCompliant.InputDevice.KEYBOARD;
import static solid.dip.devices.nonCompliant.OutputDevice.PRINTER;

public class Copier {

    void copy(InputDevice input, OutputDevice out){
        int c = read(input);
        if(out == PRINTER){
            //Send to printer
        }
        else{
            //DISK; write in disk
        }
    }


    private int read(InputDevice input){
        int i = 0;
        if (input == KEYBOARD){
            //populate i
        }else{
            //MOUSE: populate i;
        }
        return i;
    }
}
