package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weimin02
 * @date 2018/8/23
 * @project design-patterns
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double getCost() {
        double cost = 0;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item: " + item.name());
            System.out.print(", Packing: " + item.packing().pack());
            System.out.println(",Price:" + item.price());
        }
    }
}
