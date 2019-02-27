package immutable.withOtherLib.inheritance;

import lib.Address;

/**
 * Override setter
 */
public class ChildAddress extends Address {

    public ChildAddress(String firstLine, String secondLine, String city) {
        super(firstLine, secondLine, city);
    }

    @Override
    public void setFirstLine(String firstLine) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setSecondLine(String secondLine) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setCity(String city) {
        throw new UnsupportedOperationException();
    }
}
