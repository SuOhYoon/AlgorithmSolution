import java.io.*;
import java.util.*;

class Person {
    int kg;
    int cm;

    public Person(int kg, int cm) {
        this.kg = kg;
        this.cm = cm;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        List<Person> person = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            person.add(new Person(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;  // 기본 등수는 1
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (person.get(j).kg > person.get(i).kg && person.get(j).cm > person.get(i).cm) {
                    rank++;
                }
            }
            sb.append(rank).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}