class Solution {

    public List<String> removeInvalidParentheses(String s) {

        List<String> answer = new ArrayList<>();

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(s);
        visited.add(s);

        boolean found = false;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                String current = queue.poll();

                // Check if current string is valid
                if (isValid(current)) {
                    answer.add(current);
                    found = true;
                }

                // If valid strings are found,
                // don't generate strings with more removals.
                if (found) {
                    continue;
                }

                // Try removing every parenthesis
                for (int j = 0; j < current.length(); j++) {

                    char ch = current.charAt(j);

                    // We only remove '(' or ')'
                    if (ch != '(' && ch != ')') {
                        continue;
                    }

                    // Part before j
                    String firstPart = current.substring(0, j);

                    // Part after j
                    String secondPart = current.substring(j + 1);

                    // Remove character at index j
                    String next = firstPart + secondPart;

                    // Avoid duplicate strings
                    if (!visited.contains(next)) {

                        visited.add(next);

                        queue.offer(next);
                    }
                }
            }

            // Stop because these are minimum removals
            if (found) {
                break;
            }
        }

        return answer;
    }


    private boolean isValid(String s) {

        int count = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                count++;
            }

            else if (ch == ')') {

                count--;

                // More closing brackets than opening brackets
                if (count < 0) {
                    return false;
                }
            }
        }

        // All opening brackets must be matched
        return count == 0;
    }
}
