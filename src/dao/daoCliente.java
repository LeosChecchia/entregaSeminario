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

        try ( Connection connection = cx.conectar();  PreparedStatement ps = connection.prepareStatement(sqlInsert)) {

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

        try ( Connection connection = cx.conectar();  PreparedStatement ps = connection.prepareStatement(sqlSelect);  ResultSet rs = ps.executeQuery()) {

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

    /*
    public Cliente read(int id) {
        Cliente c = new Cliente();
        try {

            PreparedStatement ps = cx.conectar().prepareStatement("SELECT * FROM clientes WHERE id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setDireccion(rs.getString("direccion"));
                c.setTelefono(rs.getString("telefono"));
                c.setEmpresa(rs.getString("empresa"));
            }
            ps.close();
            ps = null;
            cx.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(daoCliente.class.getName()).log(Level.SEVERE, null, ex);

        }
        return c;
    }*/
    public Cliente read(int id) {
        Cliente c = null;  // Inicializa c como null para indicar que no se encontró un cliente
        try {
            // Preparar la consulta SQL
            PreparedStatement ps = cx.conectar().prepareStatement("SELECT * FROM clientes WHERE id=?");
            ps.setInt(1, id);  // Ajustar el índice a 1

            // Ejecutar la consulta
            ResultSet rs = ps.executeQuery();

            // Si se encuentra un resultado, crear y llenar el objeto Cliente
            if (rs.next()) {
                c = new Cliente();  // Crear una instancia solo si hay datos
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setDireccion(rs.getString("direccion"));
                c.setTelefono(rs.getString("telefono"));
                c.setEmpresa(rs.getString("empresa"));
            }

            // Cerrar recursos
            rs.close();
            ps.close();
            cx.desconectar();

        } catch (SQLException ex) {
            Logger.getLogger(daoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        return c;  // Devolver el cliente encontrado o null si no se encontró
    }

    public boolean update(Cliente cli) {
        try {
            String sqlUpdate = "UPDATE clientes set nombre=?, apellido=?, direccion=?, telefono=?, empresa=? WHERE id=?";
            PreparedStatement ps = cx.conectar().prepareStatement(sqlUpdate);

            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getApellido());
            ps.setString(3, cli.getDireccion());
            ps.setString(4, cli.getTelefono());
            ps.setString(5, cli.getEmpresa());
            ps.setInt(6, cli.getID());

            ps.execute();
            // Cerrar recursos
            ps.close();
            ps = null;
            cx.desconectar();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(daoCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean delete(int id) {

        try {
            String sqlDelete = "DELETE FROM clientes WHERE id=?";
            PreparedStatement ps = cx.conectar().prepareStatement(sqlDelete);

            ps.setInt(1, id);

            ps.execute();
            // Cerrar recursos
            ps.close();
            ps = null;
            cx.desconectar();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(daoCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

}
