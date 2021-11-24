package by.karpov.shape.observer.impl;


import by.karpov.shape.action.Action;
import by.karpov.shape.action.ActionFactory;
import by.karpov.shape.entity.Parameters;
import by.karpov.shape.entity.Shape;
import by.karpov.shape.entity.Warehouse;
import by.karpov.shape.observer.Event;
import by.karpov.shape.observer.Observer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShapeObserver implements Observer {
    private static final Logger LOGGER = LogManager.getLogger(ShapeObserver.class);

    @Override
    public void parametersChange(Event event) {
        var triangleWarehouse = Warehouse.getInstance();
        Shape shape = event.getShape();
        Action action = ActionFactory.getAction(shape.getClass());
        Parameters parameters = action.calculate(shape);
        triangleWarehouse.putParameters(shape.getId(), parameters);

        LOGGER.info( "Parameters of the triangle {} were updated", shape.getId());
    }
}
