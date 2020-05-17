/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package advandb;

/**
 *
 * @author Arturo III
 */
public class InputManipulator {

    LinearRegressionFrame f;
    String X,Y;

    public void Manipulate()
    {
           f.SET_STRINGS(X,Y);
           f.ENABLE_POPULATE_BUTTON();
    }
    public InputManipulator(LinearRegressionFrame f,String X,String Y)
    {
        this.X = X;
        this.Y = Y;
        this.f = f;
        Manipulate();
    }
}
