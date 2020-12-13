package lesson12.task1.model;

import org.apache.poi.ss.formula.functions.T;

public interface Generatable <T extends Generatable> {
    T generate();
}
