package controllers;

import com.google.inject.Inject;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import services.IndexService;

public class IndexController extends Controller
{
	private final IndexService indexService;

	@Inject
	public IndexController(IndexService indexService)
	{
		this.indexService = indexService;
	}

	public Result index()
	{
		return ok(this.indexService.index());
	}
}