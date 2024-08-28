package easy;

import java.util.HashSet;

public class Problem929 {

    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for (String email : emails) { set.add(processEmail(email)); }
        return set.size();
    }

    private String processEmail(String email) {

        String[] mail = email.split("@");

        // process local name
        StringBuilder result = new StringBuilder();
        for (char ch : mail[0].toCharArray()) {
            if (ch == '+') break;
            if (ch != '.') result.append(ch);
        }

        result.append("@").append(mail[1]);
        return result.toString();
    }
}
