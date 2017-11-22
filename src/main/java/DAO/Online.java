/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.DbUtil;
import VO.ComprasOnline;
import VO.Factura;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Manuel
 */
public class Online {

    private Connection connection;

    public Online() throws URISyntaxException {
        connection = DbUtil.getConnection();
    }

    public void facturar(ComprasOnline on) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into Factura (nombreCliente,libro1,libro2,libro3,libro4,idLi1,idLi2,idLi3,idLi4,idCompra,precio,tarjeta) values (?, ?, ?, ? , ?, ?, ?, ?, ?, ?, ?, ?)");

            // Parameters start with 1
            preparedStatement.setString(1, on.getNombreCliente());
            preparedStatement.setString(2, on.getNombreLi());
            preparedStatement.setString(3, on.getNombreLi());
            preparedStatement.setString(4, on.getNombreLi());
            preparedStatement.setString(5, on.getNombreLi());
            preparedStatement.setInt(9, on.getIdLi4());
            preparedStatement.setInt(9, on.getIdLi4());
            preparedStatement.setInt(9, on.getIdLi4());
            preparedStatement.setInt(9, on.getIdLi4());
            preparedStatement.setInt(9, on.getIdLi4());
            preparedStatement.setInt(10, on.getIdCompra());
            preparedStatement.setInt(11, on.getPrecio());
            preparedStatement.setInt(12, on.getTarjeta());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<ComprasOnline> mostarFacturas() {
        List<ComprasOnline> facs = new ArrayList<ComprasOnline>();
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from Online");
            while (rs.next()) {

                ComprasOnline f = new ComprasOnline();
                f.setNombreCliente(rs.getString("nombreCliente"));
                f.setNombreLi(rs.getString("nombreLi"));
                f.setIdLi(rs.getInt("idLi"));
                f.setIdCompra(rs.getInt("idCompra"));
                f.setPrecio(rs.getInt("precio"));
                f.setTarjeta(rs.getInt("tarjeta"));

                facs.add(f);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return facs;
    }

}
