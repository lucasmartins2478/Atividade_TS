package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe User responsável por gerenciar a conexão com o banco de dados
 * e realizar a verificação de usuários.
 */
public class User {

    /**
     * Método para estabelecer a conexão com o banco de dados MySQL.
     *
     * @return Objeto Connection caso a conexão seja bem-sucedida, ou null em caso de erro.
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            // Carrega o driver JDBC do MySQL
            Class.forName("com.mysql.Driver").newInstance();
            
            // String de conexão contendo o endereço, banco de dados, usuário e senha
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Tratar erros de conexão (log pode ser adicionado aqui)
        }
        return conn;
    }

    /**
     * Variável para armazenar o nome do usuário autenticado.
     */
    public String nome = "";

    /**
     * Variável para armazenar o resultado da verificação de autenticação.
     */
    public boolean result = false;

    /**
     * Método para verificar se um usuário existe no banco de dados com login e senha informados.
     *
     * @param Login O login do usuário.
     * @param senha A senha do usuário.
     * @return true se o usuário for encontrado, false caso contrário.
     */
    public boolean verificarUsuario(String Login, String senha) {
        String sql = "";
        Connection conn = conectarBD();
        
        // Construção da consulta SQL para verificar login e senha
        sql = "SELECT nome FROM usuarios ";
        sql += "WHERE login = '" + Login + "' ";
        sql += "AND senha = '" + senha + "'";

        try {
            // Criação e execução da consulta SQL
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            // Verifica se o usuário foi encontrado e atribui o nome
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
            // Tratar erros de execução de consulta (log pode ser adicionado aqui)
        }

        return result;
    }
}
