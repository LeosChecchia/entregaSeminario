package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
import practica01.Conexion;

public class daoCliente {

    Conexion cx = new Conexion("sistemapedidos");

    public daoCliente() {
    }

    public boolean create(Cliente cli) {
        String sqlInsert = "INSERT INTO clientes (id, nombre, apellido, direccion, telefono, empresa) VALUES (null, ?, ?, ?, ?, ?)";
        
        try (Connection connection = cx.conectar(); 
             PreparedStatement ps = connection.prepareStatement(sqlInsert)) {
            
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getApellido());
            ps.setString(3, cli.getDireccion());
            ps.setString(4, cli.getTelefono());
            ps.setString(5, cli.getEmpresa());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(daoCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            cx.desconectar();
        }
    }

    public ArrayList<Cliente> read() {
        ArrayList<Cliente> lista = new ArrayList<>();
        String sqlSelect = "SELECT * FROM CLIENTES";
        
        try (Connection connection = cx.conectar();
             PreparedStatement ps = connection.prepareStatement(sqlSelect);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setDireccion(rs.getString("direccion"));
                c.setTelefono(rs.getString("telefono"));
                c.setEmpresa(rs.getString("empresa"));
                lista.add(c); // Agregar a la lista
            }

        } catch (SQLException ex) {
            Logger.getLogger(daoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public Cliente read(int idCliente) {
        Cliente u = new Cliente();
        // Implementación de lectura de un cliente específico si es necesario
        return u;
    }

    public boolean update() {
        // Implementación de actualización si es necesario
        return true;
    }

    public boolean delete() {
        // Implementación de borrado si es necesario
        return true;
    }

}
