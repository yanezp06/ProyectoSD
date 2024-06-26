
package practicas_dos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CONEX {
    private static Connection connection;
    String url = "jdbc:mysql://localhost:3306/ESTUDIANTES?useUnicode=true&characterEncoding=UTF-8";
    String user="root";
    String pass="";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cx;
    
    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/estudiantes", "root", "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    
    public CONEX() {
        try{
            Class.forName(driver);
            cx= DriverManager.getConnection(url,user,pass);
        }catch (Exception e){
            System.out.println("error: "+e);
        }
    }
    
    public Connection getCx() {
        return cx;
    }
    
    public List<String> obtenerNombresTest() {
        List<String> nombresTest = new ArrayList<>();
        String query = "SELECT test_name FROM test";
        try (Statement stmt = cx.createStatement(); 
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                nombresTest.add(rs.getString("test_name"));
            }
        } catch (Exception e) {
            System.out.println("Error al obtener nombres de tests: " + e.getMessage());
        }
        return nombresTest;
    }
    
    public int obtenerTestIdPorNombre(String testName) {
        String query = "SELECT test_id FROM test WHERE test_name = ?";
        try (PreparedStatement ps = cx.prepareStatement(query)) {
            ps.setString(1, testName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("test_id");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    
    
    public List<Pregunta> obtenerPreguntasYOpcionesPorTestId(int testId) {
        List<Pregunta> preguntas = new ArrayList<>();
        String preguntaQuery = "SELECT question_id, question_text FROM question WHERE test_id = ?";
        String opcionQuery = "SELECT option_text, is_correct FROM option WHERE question_id = ?";

        try (PreparedStatement psPregunta = cx.prepareStatement(preguntaQuery)) {
            psPregunta.setInt(1, testId);
            ResultSet rsPregunta = psPregunta.executeQuery();

            while (rsPregunta.next()) {
                int questionId = rsPregunta.getInt("question_id");
                String questionText = rsPregunta.getString("question_text");
                List<Opcion> opciones = new ArrayList<>();

                try (PreparedStatement psOpcion = cx.prepareStatement(opcionQuery)) {
                    psOpcion.setInt(1, questionId);
                    ResultSet rsOpcion = psOpcion.executeQuery();

                    while (rsOpcion.next()) {
                        String optionText = rsOpcion.getString("option_text");
                        boolean isCorrect = rsOpcion.getBoolean("is_correct");
                        opciones.add(new Opcion(optionText, isCorrect));
                    }
                }

                preguntas.add(new Pregunta(questionText, opciones));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return preguntas;
    }

    public boolean insertarUsuarioClase(String usuario, String codigoClase) {
        String query = "INSERT INTO estudiante (USUARIO, id_numclases, nota) VALUES (?, ?, ?)";
        try (PreparedStatement ps = cx.prepareStatement(query)) {
            ps.setString(1, usuario);
            ps.setString(2, codigoClase);
            ps.setInt(3, 0);
            int filasAfectadas = ps.executeUpdate();
        
            if (filasAfectadas > 0) {
                System.out.println("Usuario insertado correctamente en la base de datos.");
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al insertar usuario en la base de datos: " + e.getMessage());
        }
        return false;
    }

    public boolean verificarCodigoClase(String codigo) {
        String query = "SELECT COUNT(*) FROM profe WHERE id_numclases = ?";
        try (PreparedStatement ps = cx.prepareStatement(query)) {
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al verificar el código de la clase: " + e.getMessage());
        }
        return false;
    }
    
    public boolean verificarExistenciaTest(int testId) {
        String query = "SELECT COUNT(*) FROM test WHERE test_id = ?";
        try (PreparedStatement ps = cx.prepareStatement(query)) {
            ps.setInt(1, testId);
            ResultSet rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean actualizarNotaUsuario(String usuario, int nota) {
       String query = "UPDATE estudiante SET nota = ? WHERE USUARIO = ?";
        try (PreparedStatement stmt = cx.prepareStatement(query)) {
            stmt.setInt(1, nota);
            stmt.setString(2, usuario);
            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Nota actualizada correctamente para el usuario: " + usuario);
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar la nota del usuario: " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }

public static class Pregunta {
    private String texto;
    private List<Opcion> opciones;

    public Pregunta(String texto, List<Opcion> opciones) {
        this.texto = texto;
        this.opciones = opciones;
    }

    public String getTexto() {
        return texto;
    }

    public List<Opcion> getOpciones() {
        return opciones;
    }
}

    public static class Opcion {
        private String texto;
        private boolean esCorrecta;

        public Opcion(String texto, boolean esCorrecta) {
            this.texto = texto;
            this.esCorrecta = esCorrecta;
        }

        public String getTexto() {
            return texto;
        }

        public boolean esCorrecta() {
            return esCorrecta;
        }
    }
 
    public static void main(String[] arg){
        CONEX cn= new CONEX();
        boolean codigoExiste = cn.verificarCodigoClase("12345");
        if (codigoExiste) {
            System.out.println("El código de la clase existe.");
        } else {
            System.out.println("El código de la clase no existe.");
        }

        // Cerrar la conexión
            
        
    }
    
}
