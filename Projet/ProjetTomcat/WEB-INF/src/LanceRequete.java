import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import main.MainTomcat;

import java.sql.*;
import java.io.*;

public class LanceRequete extends HttpServlet {
	String username;
	String password;
	String url;
	String requete ="";
	String nom;
	int nbre;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Lance requete!</title>");
        out.println("</head>");
        out.println("<body>");

	// ---- configure START
	username = "lo17xxx";
	password = "dblo17";
	// The URL that will connect to TECFA's MySQL server
        // Syntax: jdbc:TYPE:machine:port/DB_NAME
        url = "jdbc:postgresql://tuxa.sme.utc/dblo17";
	// ---- configure END

	String requete;
	requete = request.getParameter("requete");

	// recupere le contexte et la requete SQL
	ServletContext context = getServletContext();
	requete = MainTomcat.getRequeteNormalisee(requete, context);
	
	//requete = "SELECT distinct titreResume.article FROM titreResume, email WHERE mot = 'pape' AND email = 'r@tf1.fr' AND titreResume.article = email.article ORDER BY titreResume.article";
	//requete = "SELECT distinct titreResume.article FROM titreResume, email WHERE mot = 'euro' AND email = 'r@tf1.fr' AND titreResume.article = email.article ORDER BY titreResume.article";
	//requete = "SELECT distinct email FROM email";
//	requete = "SELECT distinct titreResume.article FROM titreResume, email WHERE mot = 'euro' OR mot = 'france' AND email = 'r@tf1.fr' AND titreResume.article = email.article ORDER BY titreResume.article";
//	requete = "SELECT count(titreResume.article) FROM titreResume, email WHERE mot = 'euro' AND email = 'r@tf1.fr' AND titreResume.article = email.article";
	
	//requete = "select distinct titreresume.article from titreresume, email where mot = 'pape' AND email = 'agautier@tf1.fr' AND titreResume.article = email.article";
	
	if (requete != null) {
		// INSTALL/load the Driver (Vendor specific Code)
		try {
			Class.forName("org.postgresql.Driver");
			} catch(java.lang.ClassNotFoundException e) {
	    		System.err.print("ClassNotFoundException: ");
	    		System.err.println(e.getMessage());
			}
		try {
			Connection con;
			Statement stmt;
			// Establish Connection to the database at URL with usename and password
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement();
			// Send the query and bind to the result set
			ResultSet rs = stmt.executeQuery(requete);
			ResultSetMetaData rsmd=rs.getMetaData();
			nbre=rsmd.getColumnCount();
			while (rs.next()) {
				for (int i=1; i<=nbre;i++){
				nom = rsmd.getColumnName(i);
				String s = rs.getString(nom);
				out.print(s);
				}
			out.print("<p>");
			}
		out.println("</body>");
		out.println("</html>");
		// Close resources
		stmt.close();
		con.close();
		}
		// print out decent erreur messages
		catch(SQLException ex) {
			System.err.println("==> SQLException: ");
			while (ex != null) {
				System.out.println("Message:   " + ex.getMessage ());
				System.out.println("SQLState:  " + ex.getSQLState ());
				System.out.println("ErrorCode: " + ex.getErrorCode ());
				ex = ex.getNextException();
				System.out.println("");
	    			}
			}
        	}
	}
}
