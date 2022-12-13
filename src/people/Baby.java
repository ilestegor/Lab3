package people;

import java.util.Objects;
import emotion.*;
public class Baby extends SmallPerson {
    private Emotion currentEmotion;
    public Baby(String name, Emotion currentEmotion){
        super(name);
        this.currentEmotion = currentEmotion;
    }
    public void doStuff(String name, String ability, String target){
        if (target.isEmpty()){
            System.out.println(getName() + ability);
        } else{
            System.out.println(getName() + ability + target);
        }

    }

    public Emotion getCurrentEmotion() {
        System.out.println(currentEmotion);
        return currentEmotion;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Baby baby = (Baby) object;
        return currentEmotion.equals(baby.currentEmotion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentEmotion);
    }

    @Override
    public String toString() {
        return "people.Baby." +
                "currentEmotion=" + currentEmotion;
    }
}
