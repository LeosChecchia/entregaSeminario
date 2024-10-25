/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.jdbc.PreparedStatement;

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

        try ( java.sql.PreparedStatement ps = cx.conectar().prepareStatement(sqlInsert)) {
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
            cx.desconectar(); // Esto se asegura de cerrar la conexión en cualquier caso
        }
    }

    public ArrayList<Cliente> read() {
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        return lista;
    }

    public Cliente read(int idCliente) {
        Cliente u = new Cliente();
        return u;
    }

    public boolean update() {
        return true;
    }

    public boolean delete() {
        return true;
    }

}
