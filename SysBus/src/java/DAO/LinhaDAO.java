package DAO;

import beans.Linha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LinhaDAO {

    private Connection connection = null;
    private PreparedStatement pstmt = null;
    
    /**
     * Construtor vazio.
     */
    public LinhaDAO() {
    }

    private Connection getConnection() throws SQLException {
        Connection conn;
        conn = ConnectionFactory.getInstance().getConnection();
        return conn;
    }
    
    /**
     * Insere uma linha no banco de dados.
     * @param linha Linha a ser inserida.
     */
    public void insert(Linha linha) {
        try {
            String queryString = "INSERT INTO linha(nome_linha,"
                    + " hora_inicio_linha, demanda_linha) VALUES(?, ?, ?)";

            connection = getConnection();

            pstmt = connection.prepareStatement(queryString);
            pstmt.setString(1, linha.getNomeLinha());
            pstmt.setTime(2, linha.getHoraInicioLinha());
            pstmt.setInt(3, linha.getDemandaLinha());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * Remove uma linha do banco de dados.
     * @param codigoLinha Código da linha a ser removida.
     */
    public void delete(int codigoLinha) {
        try {
            String queryString = "DELETE FROM linha WHERE codigo_linha = ?";

            connection = getConnection();

            pstmt = connection.prepareStatement(queryString);
            pstmt.setInt(1, codigoLinha);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * Atualiza uma linha no banco de dados.
     * @param linha Linha a ser atualizada.
     */
    public void update(Linha linha) {
        try {
            String queryString = "UPDATE linha SET nome_linha = ?,"
                    + " hora_inicio_linha = ?, demanda_linha = ? WHERE"
                    + " codigo_linha = ?";

            connection = getConnection();

            pstmt = connection.prepareStatement(queryString);
            pstmt.setString(1, linha.getNomeLinha());
            pstmt.setTime(2, linha.getHoraInicioLinha());
            pstmt.setInt(3, linha.getDemandaLinha());
            pstmt.setInt(4, linha.getCodigoLinha());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}