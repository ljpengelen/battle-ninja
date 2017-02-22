package controllers;

import com.google.inject.Singleton;
import ninja.Result;
import ninja.Results;

/**
 * Created by sam on 22/02/2017.
 */
@Singleton
public class MessageController {

    public Result index() {
        return Results.html();
    }

    public Result newPost() {
        ApplicationController.SimplePojo simplePojo = new ApplicationController.SimplePojo();
        simplePojo.content = "Message posted";

        return Results.json().render(simplePojo);
    }

}
