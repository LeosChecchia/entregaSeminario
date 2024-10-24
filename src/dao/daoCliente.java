/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Cliente;

public class daoCliente {

    public daoCliente() {
    }
    
    public boolean create(){
        return true;
    }
    
    public ArrayList<Cliente> read(){
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        return lista;
    }
    
    public Cliente read(int idCliente){
        Cliente u = new Cliente();
        return u;
    }
    
    public boolean update(){
        return true;
    }
    
    public boolean delete(){
        return true;
    }
    
}
