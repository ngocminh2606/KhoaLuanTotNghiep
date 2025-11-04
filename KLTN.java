public class KLTN<T, V> implements Comparable<KLTN<T, V>> {
    private T student;
    private V instructor;
    private String thesisName;

    public KLTN(T student, V instructor, String thesisName) {
        this.student = student;
        this.instructor = instructor;
        this.thesisName = thesisName;
    }

    public String getThesisName() {
        return thesisName;
    }

    @Override
    public int compareTo(KLTN<T, V> other) {
        return this.thesisName.compareToIgnoreCase(other.thesisName);
    }

    @Override
    public String toString() {
        return "KLTN{" +
                "thesisName='" + thesisName + '\'' +
                ", student=" + student +
                ", instructor=" + instructor +
                '}';
    }
}
