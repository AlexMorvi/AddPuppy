package com.app.jdlv.addpuppy;

import com.app.jdlv.addpuppy.dao.PetDAO;
import com.app.jdlv.addpuppy.entity.Pet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/add-pet")
public class AddPetServlet extends HttpServlet {
    private PetDAO petDAO;

    @Override
    public void init() throws ServletException {
        petDAO = new PetDAO();  // Asegúrate de que PetDAO use JPA
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String breed = request.getParameter("breed");
        int age = Integer.parseInt(request.getParameter("age"));

        Pet pet = new Pet(name, breed, age);
        petDAO.savePet(pet);  // Utiliza JPA para guardar la entidad

        response.sendRedirect("index.jsp");
    }
}
