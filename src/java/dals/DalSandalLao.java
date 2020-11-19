/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dals;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.SandalLao;
import models.Model;

/**
 *
 * @author Lrandom
 */
public class DalSandalLao extends Conn implements IDal {

    public static final String TABLE_NAME = "sandal_lao";

    public DalSandalLao() {
        super();
    }

    @Override
    public ArrayList<SandalLao> getAll() {
        ArrayList<SandalLao> sandals = new ArrayList<>();
        String sql = "SELECT * FROM " + TABLE_NAME;
        try {
            PreparedStatement preparedStatement = this.getConnection().prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                SandalLao sandalLao = new SandalLao();
                sandalLao.setId(rs.getLong("id"));
                sandalLao.setContent(rs.getString("content"));
                sandalLao.setPrice(rs.getFloat("price"));
                sandalLao.setName(rs.getString("name"));
                sandalLao.setPicture(rs.getString("picture"));
                sandals.add(sandalLao);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return sandals;
    }

    @Override
    public Model getOne(Long id) {
        SandalLao sandalLao = new SandalLao();
        String sql = "SELECT * FROM " + TABLE_NAME + " WHERE id=?";
        try {
            PreparedStatement preparedStatement = this.getConnection().prepareStatement(sql);
            preparedStatement.setLong(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();
            sandalLao.setId(rs.getLong("id"));
            sandalLao.setContent(rs.getString("content"));
            sandalLao.setPrice(rs.getFloat("price"));
            sandalLao.setName(rs.getString("name"));
            sandalLao.setPicture(rs.getString("picture"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return sandalLao;
    }

}
