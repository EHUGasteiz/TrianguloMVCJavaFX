package eus.ehu.eivg.triangulomvcjavafx.model;


import javafx.beans.property.SimpleDoubleProperty;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Esta clase representa un triángulo rectángulo.
 * Constituye el modelo de la aplicación
 *
 * @author mikel
 */
public class TrianguloRectangulo {
    private static final TrianguloRectangulo mTrianguloRectangulo = new TrianguloRectangulo(10, 10);


    // Atributos
    private SimpleDoubleProperty base;
    private SimpleDoubleProperty altura;
    private SimpleDoubleProperty hipotenusa;

    private TrianguloRectangulo(double pBase, double pAltura) {
        if (pBase < 0 || pAltura < 0) {
            throw new IllegalArgumentException();
        }
        base = new SimpleDoubleProperty(pBase);
        altura = new SimpleDoubleProperty(pAltura);
        setHipotenusa();
    }

    public static TrianguloRectangulo getTrianguloRectangulo() {
        return mTrianguloRectangulo;
    }

    // Getters

    public SimpleDoubleProperty getBase() {
        return base;
    }

    /**
     * Establece el nuevo valor de la base
     *
     * @param pBase -- la base
     * @require pBase >= 0
     */
    public void setBase(double pBase) {
        if (pBase < 0) {
            throw new IllegalArgumentException();
        }
        base.setValue(pBase);
        setHipotenusa();
    }

    public SimpleDoubleProperty getAltura() {
        return altura;
    }

    /**
     * Establece el nuevo valor de la altura
     *
     * @param pAltura -- la altura
     * @require pAltura >= 0
     */
    public void setAltura(double pAltura) {
        if (pAltura < 0) {
            throw new IllegalArgumentException();
        }
        altura.setValue(pAltura);
        setHipotenusa();
    }

    public SimpleDoubleProperty getHipotenusa() {
        return hipotenusa;
    }

    /**
     *
     */
    private void setHipotenusa() {
        double hipValue = sqrt(pow(base.doubleValue(), 2) + pow(altura.doubleValue(), 2));
        if (hipotenusa == null) {
            hipotenusa = new SimpleDoubleProperty(hipValue);
        } else {
            this.hipotenusa.setValue(hipValue);
        }
    }

}
