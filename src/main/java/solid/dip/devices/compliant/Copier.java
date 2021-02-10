package solid.dip.devices.compliant;

public class Copier {

    /***
     * Copier does not create writer object.
     * inverts responsbility and leaves it to the client of copy method
     * @param input
     * @param out
     */
    void copy(Reader input, Writer out){
        int c = input.read();
        out.write(c);
    }
}
