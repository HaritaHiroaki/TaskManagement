package controllers;

import java.util.*;

import models.Project.*;
import play.mvc.*;

public class ProjectControllers extends Controller {

	public static void projectList() {
		// 一覧表示用にプロジェクトを全件取得
		final List<Project> project = Project.findAll();
		render(project);
	}

}