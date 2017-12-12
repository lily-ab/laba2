package com.lab2.ConditionStrategy;

import com.lab2.Entity.Animals.Animal;
import com.lab2.Entity.Cells.Cell;

public class AnimalCondition {

    private int conditionValue;
    Context context = new Context();
    private int maxNormalValue=20;
    private int minNormalValue=10;
    private int minBadValue=0;
    public AnimalCondition() {
        conditionValue = 0;
    }

    public Condition getCondition(Animal animal) {
        context.setStrategy(new ConditionByAmount());
        conditionValue = context.getConditionStrategy(animal, conditionValue);
        context.setStrategy(new ConditionByCellType());
        conditionValue = context.getConditionStrategy(animal, conditionValue);
        context.setStrategy(new ConditionByGender());
        conditionValue = context.getConditionStrategy(animal, conditionValue);

        if (conditionValue < minBadValue) {
            return Condition.AWFUL;
        }
        if (conditionValue >= minBadValue && conditionValue < minNormalValue) return Condition.BAD;
        if (conditionValue >= minNormalValue && conditionValue < maxNormalValue) return Condition.NORMAL;
        return Condition.GOOD;
    }
}

