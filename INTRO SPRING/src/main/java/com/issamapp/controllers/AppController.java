package com.issamapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.issamapp.controllers.models.CreateAccountModel;
import com.issamapp.controllers.models.JsonResponse;

//!!!!!!!!!!!!!!!! ANNOTATIONS !!!!!!!!!!!!!!!!!!!!

@RestController
@RequestMapping("/app")
public class AppController {

	
	// GET POST PUT DELETE !!!
	
	// GET DELETE
	@GetMapping("/bonjour") 
	public String bonjour() {
		return "Bonjour";
	}
	
	
	@GetMapping("/somme") 
	public int somme(  @RequestParam( name="x", required=true )  int x, @RequestParam( name="y", required=true ) int y  ) {
		return (x+y);
	}
	
	
	@GetMapping("/user/{id}") 
	public int userID( @PathVariable( name="id" ) int idUser ) {
		System.out.println(idUser);
		
		return (idUser);
	}
	
	
	
	
	// POST  PUT !!!!
	
	@PostMapping("/create-account")
	public ResponseEntity<?> createAccount(   @RequestBody CreateAccountModel data   ) {
		String fullname = data.getFullname();
		String email = data.getEmail();
		
		System.out.println(fullname);
		System.out.println(email);
		
		
		
		
		
		// ENTITY
		
		// INSERT DATABASE
		
		// 50* error code
		// 400 bad request
		// 401 not authorized
		// 403 access denied ( img ... )
		// 404 not found
		// 20* SUCCESS
		
		
		
		
		return ( ResponseEntity.status(401).body( new JsonResponse(false,"something went wrong") ) );
		
		
	}
	
	
	
	
	/**
	 * @GetMapping("/user") 
	public String findUser() {
		return "user get";
	}
	
	@PostMapping("/user") 
	public String addUser() {
		return "user post";
	}
	@PutMapping("/user") 
	public String editUser() {
		return "edit user put";
	}
	
	@DeleteMapping("/user") 
	public String deleteUser() {
		return " user delete";
	}
	
	 */
	
	
	
	
}
