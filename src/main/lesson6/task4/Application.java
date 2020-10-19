package main.lesson6.task4;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();
        for (int i = 0; i < 500; i++) {
            persons.add(Person.random());
        }


        Map<IdentityDocumentType, Integer> counters = new TreeMap<>();
        for (IdentityDocumentType documentType : IdentityDocumentType.values()) {
            counters.put(documentType, 0);
        }
        for (Person person : persons) {
            IdentityDocumentType docType = person.getIdentityDocument().getIdentityDocumentTypeSet();
            counters.put(docType, counters.get(docType) + 1);
        }


        List<String> identityDocumentTypeCodes = new ArrayList<>();
        for (IdentityDocumentType documentType : IdentityDocumentType.values()) {
            identityDocumentTypeCodes.add(documentType.getIdDoc());
        }
        Collections.sort(identityDocumentTypeCodes);
        Collections.reverse(identityDocumentTypeCodes);


        for (String code : identityDocumentTypeCodes) {
            IdentityDocumentType documentType = IdentityDocumentType.byCode(code);
            System.out.printf("%s: %d%n", code, counters.get(documentType));
        }


        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (!person.getIdentityDocument().getIdentityDocumentTypeSet().getIdDoc().equals("21"))
                iterator.remove();
        }

        System.out.println("Количество людей в списке: " + persons.size());


    }
}
