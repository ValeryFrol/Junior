package search;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей< которые содержат key  любых полях
     *
     * @param key key for the search
     * @return list of the suitable persons
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        return result;
    }


}
