package controllers;

import com.google.inject.Singleton;
import ninja.Result;
import ninja.Results;

/**
 * Created by sam on 22/02/2017.
 */
@Singleton
public class UserController {

    public Result index() {
        return Results.html();
    }

    public Result newUser() {
        return Results.json().render("test", "User not created");
    }

}
