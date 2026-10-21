package com.giaolang.mathutil.core;

public class MathUtil {

    public static long getFactorial(int n) {

//        //thuật toán tính n! = 1.2.3... n, n từ 0...20
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid parameter. n must be between 0 and 20");
//        }
//        if (n == 0) {
//            return 1;  //n = 0 return ngay
//        }
//        //sure n từ 1..20
//        long result = 1;  //khởi đầu giai thừa bằng 1, nhân dồn
//                          // Cố tình làm code bị lỗi để test CI
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;

        // Refactor tối ưu, tinh chỉnh source code
        // Code mới khi được đưa lên server phải được check lại ngay phải check lại ngay ở nhánh dev hoặc khi đưa vaào nhánh main thì
        // cũng phải đảm bảo nó màu xanh, pass được các test case
        // Lý do hàm thì phải chạy đúng
        // Nếu project có sẵn tdd, unit test, thì quá trình kiểm thử lại code vừa sửa diễn ra rất nhanh rất tiện do unit test khi phối hợp với CI script (.yaml)
        // sẽ được tự động run và tự báo màu xanh đỏ và gửi mail
        // Test lại thử đã từng test để chắc chắn rằng nó vẫn còn ổn sau khi được sửa gọi là kiểm thử hồi quy (Regression Testing)
        // Recursion - Đệ quy
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid parameter");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);

    }

}
