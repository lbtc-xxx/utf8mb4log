package utf8mb4log;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/")
public class LoggingServlet extends HttpServlet {
	private static final Logger log = LoggerFactory.getLogger(LoggingServlet.class);
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.info("2-byte char: À");  // OK
        log.info("3-byte char: あ"); // NG
		log.info("4-byte char: 𥹖"); // NG
	}
}
