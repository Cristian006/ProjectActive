package ponce.cristian.fit.core.muscle;

/**
 * Created by Cristian Ponce on 4/23/2017.
 */

public class MuscleGroup {
    private MuscleType _muscleType;
    private String _name;
    private String _description;

    public MuscleType getMuscleType(){
        return  _muscleType;
    }

    public void setMuscleType(MuscleType mType){
        _muscleType = mType;
    }

    public String getName(){
        return _name;
    }

    public  void setName(String n){
        _name = n;
    }

    public String getDescription(){
        return _description;
    }

    public void setDescription(String desc){
        _description = desc;
    }

    public MuscleGroup(){
        //Empty Constructor
        setMuscleType(MuscleType.None);
        setName("");
        setDescription("");
    }

    public MuscleGroup(MuscleType mType, String name, String description){
        setMuscleType(mType);
        setName(name);
        setDescription(description);
    }
}
