/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.daw.dao;

import net.daw.bean.RecetaBean;
import net.daw.helper.Conexion;

/**
 *
 * @author Alejandro
 */
public class RecetaDao extends GenericDaoImplementation<RecetaBean> {

    public RecetaDao(Conexion.Tipo_conexion tipoConexion, String tabla) throws Exception {
        super(tipoConexion, tabla);
    }
    
}
