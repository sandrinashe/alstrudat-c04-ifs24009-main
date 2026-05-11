package del.alstrudat;

public class Student {
    public String nim;
    public String name;
    public int score;

    public Student(String nim, String name, int score) {
        this.nim = nim;
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return nim + "|" + name + "|" + score;
    }
}