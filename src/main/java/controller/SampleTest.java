package controller;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/test0610")//ウェブサーブレットアドテーション
public class SampleTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Content-Type ヘッダの設定
        // html を返す。文字コードは、UTF-8。
        response.setContentType("text/html; charset=UTF-8");
        // なんか処理してるっぽいようにしたいので、文字列を用意する。
        String name = "木村華\n";
        String university = "東京学芸大学\n";
        String classes = "情報科\n";
        // 返す html を生成する。
        PrintWriter out = response.getWriter();
        out.println("<html>\n" + name + university + classes + "</html>");

    }
}