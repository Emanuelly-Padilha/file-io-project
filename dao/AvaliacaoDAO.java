package br.edu.ifpr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.edu.ifpr.model.Avaliacao;

public class AvaliacaoDAO {
        public void inserir(Avaliacao a) {
        String sql = "INSERT INTO avaliacoes (id_usuario, id_filme, nota, review) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, a.getUsuarioId());
            ps.setInt(2, a.getFilmeId());
            ps.setInt(3, a.getNota());
            ps.setString(4, a.getReview());

            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    a.setId(rs.getInt(1));
                }
            }

        } catch (SQLException e) {
            System.out.println("Erro ao inserir avaliação: " + e.getMessage());
        }
    }

    public void deletar(int id) {
        String sql = "DELETE FROM avaliacoes WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao deletar avaliação: " + e.getMessage());
        }
    }

}
