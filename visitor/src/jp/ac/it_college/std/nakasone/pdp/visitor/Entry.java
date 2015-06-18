package jp.ac.it_college.std.nakasone.pdp.visitor;

import java.util.Iterator;

/**
 * Created by tsuyoshi on 2015/06/11.
 */
public abstract class Entry implements Element {
    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public Iterator<Entry> iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
