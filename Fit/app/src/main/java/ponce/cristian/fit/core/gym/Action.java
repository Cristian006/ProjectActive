package ponce.cristian.fit.core.gym;

import java.util.ArrayList;
import java.util.HashMap;

import ponce.cristian.fit.core.muscle.MuscleGroup;

/**
 * Created by Cristian Ponce on 4/23/2017.
 */

/*
    An Exercise Class
 */
public class Action {
    String name;
    String description;
    ArrayList<MuscleGroup> targetedMuscleGroups;
    HashMap<Integer, String> directions;
}
