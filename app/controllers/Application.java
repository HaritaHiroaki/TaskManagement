package controllers;

import play.mvc.*;

public class Application extends Controller {

	public static void index() {
		ProjectController.projectList();
	}

}