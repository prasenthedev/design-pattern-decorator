import com.designpatterns.decorator.BaseWrap;
import com.designpatterns.decorator.components.ProteinWrap;
import com.designpatterns.decorator.components.VegWrap;
import com.designpatterns.decorator.components.VeganWrap;
import com.designpatterns.decorator.decorators.Avocado;
import com.designpatterns.decorator.decorators.ExtraProtein;
import com.designpatterns.decorator.decorators.PestoSauce;

public class TestDriveDecorator {
    public static void main(String[] args) {

        // Protein Wrap with Avocado topping
        /*BaseWrap proteinWrap = new ProteinWrap();
        proteinWrap = new Avocado(proteinWrap);
        System.out.print("Order 1 \t");
        System.out.println(proteinWrap.getDescription() + ". Cost: $" + proteinWrap.cost());
        System.out.println("************************************************************************");

        // Veg Wrap with Pesto Sauce topping
        BaseWrap vegWrap = new VegWrap();
        vegWrap = new PestoSauce(vegWrap);
        System.out.print("Order 2 \t");
        System.out.println(vegWrap.getDescription() + ". Cost: $" + vegWrap.cost());
        System.out.println("************************************************************************");

        // Vegan Wrap with Avocado topping
        BaseWrap veganWrap = new VeganWrap();
        veganWrap = new Avocado(veganWrap);
        System.out.print("Order 3 \t");
        System.out.println(veganWrap.getDescription() + ". Cost: $" + veganWrap.cost());
        System.out.println("************************************************************************");*/

        // Jumbo Protein Wrap with all toppings
        BaseWrap jumboProteinWrap = new ProteinWrap();
        jumboProteinWrap = new Avocado(jumboProteinWrap);
        jumboProteinWrap = new PestoSauce(jumboProteinWrap);
        jumboProteinWrap = new ExtraProtein(jumboProteinWrap);
        System.out.print("Order 4 \t");
        System.out.println(jumboProteinWrap.getDescription() + ". Cost: $" + jumboProteinWrap.cost());
        System.out.println("************************************************************************");

    }
}