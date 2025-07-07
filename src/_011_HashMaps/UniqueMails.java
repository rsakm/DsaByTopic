package _011_HashMaps;

import java.util.HashSet;

public class UniqueMails {
    public int numUniqueEmails(String[] emails) {

        HashSet<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];

            // Remove everything after '+'
            int plusIndex = local.indexOf('+');
            if (plusIndex != -1) {
                local = local.substring(0, plusIndex);
            }

            // Remove all '.'
            local = local.replace(".", "");

            String normalized = local + "@" + domain;
            uniqueEmails.add(normalized);
        }

        return uniqueEmails.size();
    }
}
