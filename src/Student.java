public class Student {
    String first, last;
    int year;

    public Student(String first, String last, int year) {
        this.first = first;
        this.last = last;
        this.year = year;
    }

    @Override
    public String toString() {
        return last + ", " + first + ": " + year;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public int getYear() {
        return year;
    }
}
