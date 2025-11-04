public class Teacher {
    private String id;
    private String fullname;
    private String email;
    private String title; // chức danh

    public Teacher(String id, String fullname, String email, String title) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
