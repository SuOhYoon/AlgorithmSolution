import java.util.*;
import java.io.*;

class Person {
    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] parts = br.readLine().split(" ");
            int age = Integer.parseInt(parts[0]);
            String name = parts[1];
            people.add(new Person(age, name));
        }

        // 나이 기준 오름차순 정렬 (같은 나이는 입력 순서 유지)
        people.sort(Comparator.comparingInt(p -> p.age));

        for (Person p : people) {
            System.out.println(p.age + " " + p.name);
        }
    }
}
