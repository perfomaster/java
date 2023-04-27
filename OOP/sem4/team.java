import SHIELD.withshield;

import java.util.*;

public class team <E extends warrior> implements Iterable<E>{
    private List<E> team = new ArrayList<>();
    
    public team<E> addWarriorToTeam(E person) {
        team.add(person);
        return this;
    }

    @Override
    public Iterator<E> iterator() {
        return team.iterator();
    }

    public E minArmor(){
        E element = null;
        Iterator<E> iterator = this.iterator();

        while (iterator.hasNext() && element == null){
            E currentElement = iterator.next();
            if (currentElement instanceof withshield){
                element = currentElement;

            }
        }

        while (iterator.hasNext()){
            E currentElement = iterator.next();
            if (currentElement instanceof withshield){
                if (((withshield) currentElement).armor() < ((withshield) element).armor()){
                    element = currentElement;
                }
            }
        }

        return element;
    }

    public int maxTeamRange() {
        int maxRange = 0;
        for (E item : team) {
            if(item instanceof bowTeam) {
                if(((bowTeam)item).shotRange() > maxRange) maxRange = ((bowTeam)item).shotRange();
            }
        }
        return maxRange;
    }



}