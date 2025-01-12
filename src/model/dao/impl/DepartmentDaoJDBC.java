package model.dao.impl;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.helper.Factory;

import java.sql.*;
import java.util.List;

public class DepartmentDaoJDBC extends Factory implements DepartmentDao {

    private final Connection conn;

    public DepartmentDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Department obj) {

        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "INSERT INTO department "
                            + "(Id, Name)"
                            + "VALUES "
                            + "(?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setInt(1,obj.getId());
            st.setString(2, obj.getName());

            int rowsAffected = st.executeUpdate();

            if(rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if(rs.next()) {
                    int id = rs.getInt(1);
                    obj.setId(id);
                }
                DB.closeResultSet(rs);
            }
            else {
                throw new DbException("Error! No rows Affected!");
            }
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void update(Department obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {
        return null;
    }

    @Override
    public List<Department> findAll() {
        return List.of();
    }


}
