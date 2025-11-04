public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("S01", "Nguyễn Văn A", "a@uet.edu.vn");
        Student s2 = new Student("S02", "Lê Thị B", "b@uet.edu.vn");
        Student s3 = new Student("S03", "Trần Minh C", "c@uet.edu.vn");

        Teacher t1 = new Teacher("T01", "Trần Ngọc Linh", "linh@uet.edu.vn", "Phó Giáo sư");
        Advisor a1 = new Advisor("Phạm Minh", "minh@company.com");
        Teacher t2 = new Teacher("T02", "Ngô Đức Anh", "anh@uet.edu.vn", "Tiến sĩ");

        ListSortable<KLTN<Student, Object>> list = new ListSortable<>();

        list.add(new KLTN<>(s1, t1, "Ứng dụng Trí tuệ nhân tạo trong nhận diện khuôn mặt"));
        list.add(new KLTN<>(s2, a1, "Blockchain trong hệ thống bỏ phiếu an toàn"));
        list.add(new KLTN<>(s3, t2, "Phát triển hệ thống gợi ý phim sử dụng Machine Learning"));

        System.out.println("TRƯỚC KHI SẮP XẾP");
        list.print();

        System.out.println("\nSAU KHI SẮP XẾP THEO TÊN KHÓA LUẬN");
        list.sort();
        list.print();
    }
}
