/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.operaciones;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.daw.bean.MedicamentoBean;
import net.daw.dao.MedicamentoDao;
import net.daw.helper.Conexion;
/**
 *
 * @author VICENTE
 */
public class MedicamentoRemove implements GenericOperation{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        try {
            MedicamentoDao dao = new MedicamentoDao(Conexion.getConection(), "medicamento");
            MedicamentoBean bean = new MedicamentoBean();
            bean.setId(Integer.parseInt(request.getParameter("id")));
            Map<String, String> data = new HashMap<>();
            if (bean != null) {
                dao.remove(bean);
                data.put("status", "200");
                data.put("message", "se ha eliminado el registro con id=" + bean.getId());
            } else {
                data.put("status", "error");
                data.put("message", "error");
            }
            Gson gson = new Gson();
            String resultado = gson.toJson(data);
            return resultado;
        } catch (Exception e) {
            throw new ServletException("MedicamentoRemoveJson: View Error: " + e.getMessage());
        }
    }
}
