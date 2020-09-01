package sample;

import javafx.scene.layout.Pane;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class MyClassLoader {
    public List<Pane> dynamicLoad(){
        int count = 0;
        int max = 30;
        ArrayList<Pane> list = new ArrayList<>();
        while (count < max) {
            try {
                while (count < max) {
                    count++;
                    Pane p = this.getClass().getClassLoader()
                            .loadClass("panes.P" + count)
                            .asSubclass(Pane.class).getDeclaredConstructor().newInstance();
                    list.add(p);
                }
            } catch (ClassNotFoundException e) {
                System.out.println("Excepton: " + e.toString());
                continue;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
