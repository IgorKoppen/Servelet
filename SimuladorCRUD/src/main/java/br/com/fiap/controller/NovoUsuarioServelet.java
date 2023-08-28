package br.com.fiap.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.model.Usuario;
import br.com.fiap.repository.DataBase;

/**
 * Servlet implementation class NovoUsuarioServelet
 */
@WebServlet("/novoUsuario")
public class NovoUsuarioServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("formNovoUsuario.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String nomeUsuario = request.getParameter("nome");
	String emailUsuario = request.getParameter("email");
	String telefoneUsuario = request.getParameter("telefone");
	String senhaUsuario = request.getParameter("senha");

	Usuario usuario = new Usuario(nomeUsuario, emailUsuario, telefoneUsuario, senhaUsuario);
	DataBase.adiciona(usuario);
	
	request.setAttribute("usuario", usuario);
	response.sendRedirect("listaUsuario");
	
	}

}
